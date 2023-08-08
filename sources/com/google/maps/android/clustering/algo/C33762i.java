package com.google.maps.android.clustering.algo;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33763b;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.maps.android.clustering.algo.i */
public class C33762i<T extends C33763b> implements C33750a<T> {

    /* renamed from: a */
    public final LatLng f81912a;

    /* renamed from: b */
    public final Collection<T> f81913b = new LinkedHashSet();

    public C33762i(LatLng latLng) {
        this.f81912a = latLng;
    }

    /* renamed from: a */
    public boolean mo98061a(T t) {
        return this.f81913b.add(t);
    }

    /* renamed from: b */
    public Collection<T> mo98032b() {
        return this.f81913b;
    }

    /* renamed from: c */
    public boolean mo98062c(T t) {
        return this.f81913b.remove(t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C33762i)) {
            return false;
        }
        C33762i iVar = (C33762i) obj;
        if (!iVar.f81912a.equals(this.f81912a) || !iVar.f81913b.equals(this.f81913b)) {
            return false;
        }
        return true;
    }

    public LatLng getPosition() {
        return this.f81912a;
    }

    public int getSize() {
        return this.f81913b.size();
    }

    public int hashCode() {
        return this.f81912a.hashCode() + this.f81913b.hashCode();
    }

    @C0359n0
    public String toString() {
        return "StaticCluster{mCenter=" + this.f81912a + ", mItems.size=" + this.f81913b.size() + C12361b.f30259j;
    }
}
