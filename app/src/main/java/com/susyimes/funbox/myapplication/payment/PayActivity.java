package com.susyimes.funbox.myapplication.payment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.susyimes.funbox.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class PayActivity extends AppCompatActivity {
    private  PayController controller = new PayController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_dialog);

        EpoxyRecyclerView recyclerView= (EpoxyRecyclerView) findViewById(R.id.pay_list);
        recyclerView.setController(controller);
        List<String> list=new ArrayList<>();

        list.add("月度会员");
        controller.setData(list);

        list.add("月度会员");
        controller.setData(list);
    }
}
