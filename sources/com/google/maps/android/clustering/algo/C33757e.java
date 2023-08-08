package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.C33763b;
import com.google.maps.android.clustering.algo.C33754d;
import com.google.maps.android.geometry.C33871a;
import com.google.maps.android.projection.C33880a;
import com.google.maps.android.projection.C33881b;
import com.google.maps.android.quadtree.C33882a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.maps.android.clustering.algo.e */
public class C33757e<T extends C33763b> extends C33754d<T> implements C33760g<T> {

    /* renamed from: j */
    public static final C33881b f81901j = new C33881b(1.0d);

    /* renamed from: g */
    public int f81902g;

    /* renamed from: h */
    public int f81903h;

    /* renamed from: i */
    public LatLng f81904i;

    public C33757e(int i, int i2) {
        this.f81902g = i;
        this.f81903h = i2;
    }

    /* renamed from: a */
    public void mo98054a(CameraPosition cameraPosition) {
        this.f81904i = cameraPosition.f72990a;
    }

    /* renamed from: f */
    public boolean mo98055f() {
        return true;
    }

    /* renamed from: p */
    public Collection<C33754d.C33756b<T>> mo98049p(C33882a<C33754d.C33756b<T>> aVar, float f) {
        C33882a<C33754d.C33756b<T>> aVar2 = aVar;
        C33871a q = mo98056q(f);
        ArrayList arrayList = new ArrayList();
        double d = q.f82166a;
        if (d < 0.0d) {
            arrayList.addAll(aVar2.mo98590f(new C33871a(d + 1.0d, 1.0d, q.f82167b, q.f82169d)));
            q = new C33871a(0.0d, q.f82168c, q.f82167b, q.f82169d);
        }
        double d2 = q.f82168c;
        if (d2 > 1.0d) {
            arrayList.addAll(aVar2.mo98590f(new C33871a(0.0d, d2 - 1.0d, q.f82167b, q.f82169d)));
            q = new C33871a(q.f82166a, 1.0d, q.f82167b, q.f82169d);
        }
        arrayList.addAll(aVar2.mo98590f(q));
        return arrayList;
    }

    /* renamed from: q */
    public final C33871a mo98056q(float f) {
        LatLng latLng = this.f81904i;
        if (latLng == null) {
            return new C33871a(0.0d, 0.0d, 0.0d, 0.0d);
        }
        C33880a b = f81901j.mo98584b(latLng);
        double d = (double) f;
        double pow = ((((double) this.f81902g) / Math.pow(2.0d, d)) / 256.0d) / 2.0d;
        double pow2 = ((((double) this.f81903h) / Math.pow(2.0d, d)) / 256.0d) / 2.0d;
        double d2 = b.f82172a;
        double d3 = b.f82173b;
        return new C33871a(d2 - pow, d2 + pow, d3 - pow2, d3 + pow2);
    }

    /* renamed from: r */
    public void mo98057r(int i, int i2) {
        this.f81902g = i;
        this.f81903h = i2;
    }
}
