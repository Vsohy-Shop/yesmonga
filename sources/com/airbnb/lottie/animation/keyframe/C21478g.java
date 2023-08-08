package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C21568h;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.g */
public class C21478g {

    /* renamed from: a */
    public final List<C21466a<C21568h, Path>> f55396a;

    /* renamed from: b */
    public final List<C21466a<Integer, Integer>> f55397b;

    /* renamed from: c */
    public final List<Mask> f55398c;

    public C21478g(List<Mask> list) {
        this.f55398c = list;
        this.f55396a = new ArrayList(list.size());
        this.f55397b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f55396a.add(list.get(i).mo64328b().mo64300a());
            this.f55397b.add(list.get(i).mo64329c().mo64300a());
        }
    }

    /* renamed from: a */
    public List<C21466a<C21568h, Path>> mo64088a() {
        return this.f55396a;
    }

    /* renamed from: b */
    public List<Mask> mo64089b() {
        return this.f55398c;
    }

    /* renamed from: c */
    public List<C21466a<Integer, Integer>> mo64090c() {
        return this.f55397b;
    }
}
