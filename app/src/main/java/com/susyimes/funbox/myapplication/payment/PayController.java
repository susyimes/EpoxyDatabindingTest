package com.susyimes.funbox.myapplication.payment;


import android.util.Log;


import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.susyimes.funbox.myapplication.PayDialogItem1BindingModel_;
import com.susyimes.funbox.myapplication.PaydialogTitleBindingModel_;

import java.util.List;

/**
 * Created by Susyimes on 2018/1/12.
 */

public class PayController extends TypedEpoxyController<List<String>> {


    @AutoModel
    PaydialogTitleBindingModel_ title;
    @AutoModel
    PayDialogItem1BindingModel_ item1;


    @Override
    protected void buildModels(List<String> data1) {
        Log.d("pengying","123");
        title.title("123");
        item1.item1(data1.get(0)).clickListener((model, parentView, clickedView, position) -> {

            Log.d("pengying","control");
        });


    }
}
