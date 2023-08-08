package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.C21686j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.b */
public class C21444b {

    /* renamed from: a */
    public List<C21464t> f55256a = new ArrayList();

    /* renamed from: a */
    public void mo64027a(C21464t tVar) {
        this.f55256a.add(tVar);
    }

    /* renamed from: b */
    public void mo64028b(Path path) {
        for (int size = this.f55256a.size() - 1; size >= 0; size--) {
            C21686j.m99801b(path, this.f55256a.get(size));
        }
    }
}
