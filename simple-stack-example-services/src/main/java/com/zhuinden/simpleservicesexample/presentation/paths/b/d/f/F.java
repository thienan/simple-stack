package com.zhuinden.simpleservicesexample.presentation.paths.b.d.f;

import com.google.auto.value.AutoValue;
import com.zhuinden.servicetree.ServiceTree;
import com.zhuinden.simpleservicesexample.R;
import com.zhuinden.simpleservicesexample.application.Key;
import com.zhuinden.simpleservicesexample.utils.MockService;


/**
 * Created by Zhuinden on 2017.02.14..
 */

@AutoValue
public abstract class F
        extends Key {
    @Override
    public int layout() {
        return R.layout.path_f;
    }

    public static F create() {
        return new AutoValue_F();
    }

    @Override
    public void bindServices(ServiceTree.Node node) {
        node.bindService("F", new MockService("F"));
    }
}
