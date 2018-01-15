package com.susyimes.funbox.myapplication.payment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;


import com.airbnb.epoxy.EpoxyRecyclerView;
import com.susyimes.funbox.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Susyimes on 2018/1/11.
 */

public class PayDialog extends Dialog {
    private final PayController payController=new PayController();
    private Context context;

    public PayDialog(@NonNull Context context) {
        super(context);
        this.context=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_dialog);

        EpoxyRecyclerView recyclerView= (EpoxyRecyclerView) findViewById(R.id.pay_list);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, 1));
        recyclerView.setController(payController);

        List<String> list=new ArrayList<>();
        list.add("月度会员");

        payController.setData(list);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                list.add("年度会员");
                payController.setData(list);
            }
        },100000);

        Window win = this.getWindow();
        win.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams lp = win.getAttributes();
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.BOTTOM;
        //lp.windowAnimations = R.style.dialog_animation_from_bottom;
        win.setAttributes(lp);
        win.setBackgroundDrawableResource(android.R.color.transparent);

    }


}
