package com.google.maps.android.data.kml;

import androidx.annotation.C0359n0;
import androidx.compose.material3.TextFieldImplKt;
import com.google.android.gms.maps.model.C30579d;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.maps.android.data.kml.b */
public class C33849b {

    /* renamed from: a */
    public final HashMap<String, String> f82075a;

    /* renamed from: b */
    public final HashMap<C33859k, Object> f82076b;

    /* renamed from: c */
    public final ArrayList<C33849b> f82077c;

    /* renamed from: d */
    public final HashMap<C33853e, C30579d> f82078d;

    /* renamed from: e */
    public final HashMap<String, String> f82079e;

    /* renamed from: f */
    public HashMap<String, C33865o> f82080f;

    /* renamed from: g */
    public String f82081g;

    public C33849b(HashMap<String, String> hashMap, HashMap<String, C33865o> hashMap2, HashMap<C33859k, Object> hashMap3, HashMap<String, String> hashMap4, ArrayList<C33849b> arrayList, HashMap<C33853e, C30579d> hashMap5, String str) {
        this.f82075a = hashMap;
        this.f82076b = hashMap3;
        this.f82080f = hashMap2;
        this.f82079e = hashMap4;
        this.f82077c = arrayList;
        this.f82078d = hashMap5;
        this.f82081g = str;
    }

    /* renamed from: a */
    public String mo98442a() {
        return this.f82081g;
    }

    /* renamed from: b */
    public Iterable<C33849b> mo98443b() {
        return this.f82077c;
    }

    /* renamed from: c */
    public HashMap<C33853e, C30579d> mo98444c() {
        return this.f82078d;
    }

    /* renamed from: d */
    public Iterable<C33853e> mo98445d() {
        return this.f82078d.keySet();
    }

    /* renamed from: e */
    public Iterable<C33859k> mo98446e() {
        return this.f82076b.keySet();
    }

    /* renamed from: f */
    public HashMap<C33859k, Object> mo98447f() {
        return this.f82076b;
    }

    /* renamed from: g */
    public Iterable<String> mo98448g() {
        return this.f82075a.keySet();
    }

    /* renamed from: h */
    public String mo98449h(String str) {
        return this.f82075a.get(str);
    }

    /* renamed from: i */
    public C33865o mo98450i(String str) {
        return this.f82080f.get(str);
    }

    /* renamed from: j */
    public String mo98451j(String str) {
        return this.f82079e.get(str);
    }

    /* renamed from: k */
    public HashMap<String, String> mo98452k() {
        return this.f82079e;
    }

    /* renamed from: l */
    public HashMap<String, C33865o> mo98453l() {
        return this.f82080f;
    }

    /* renamed from: m */
    public boolean mo98454m() {
        return this.f82077c.size() > 0;
    }

    /* renamed from: n */
    public boolean mo98455n() {
        return this.f82076b.size() > 0;
    }

    /* renamed from: o */
    public boolean mo98456o() {
        return this.f82075a.size() > 0;
    }

    /* renamed from: p */
    public boolean mo98457p(String str) {
        return this.f82075a.containsKey(str);
    }

    /* renamed from: q */
    public void mo98458q(C33859k kVar, Object obj) {
        this.f82076b.put(kVar, obj);
    }

    @C0359n0
    public String toString() {
        return TextFieldImplKt.f19855i + C33093b.f80281i + "\n properties=" + this.f82075a + ",\n placemarks=" + this.f82076b + ",\n containers=" + this.f82077c + ",\n ground overlays=" + this.f82078d + ",\n style maps=" + this.f82079e + ",\n styles=" + this.f82080f + "\n}\n";
    }
}
