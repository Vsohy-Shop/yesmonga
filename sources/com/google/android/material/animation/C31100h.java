package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.annotation.C0322b;
import androidx.annotation.C0330d1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1886l;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.android.material.animation.h */
public class C31100h {

    /* renamed from: c */
    public static final String f74438c = "MotionSpec";

    /* renamed from: a */
    public final C1886l<String, C31101i> f74439a = new C1886l<>();

    /* renamed from: b */
    public final C1886l<String, PropertyValuesHolder[]> f74440b = new C1886l<>();

    /* renamed from: a */
    public static void m124660a(@C0359n0 C31100h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo87864l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo87865m(objectAnimator.getPropertyName(), C31101i.m124673b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @C0363p0
    /* renamed from: c */
    public static C31100h m124661c(@C0359n0 Context context, @C0359n0 TypedArray typedArray, @C0330d1 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m124662d(context, resourceId);
    }

    @C0363p0
    /* renamed from: d */
    public static C31100h m124662d(@C0359n0 Context context, @C0322b int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m124663e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m124663e(arrayList);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            return null;
        }
    }

    @C0359n0
    /* renamed from: e */
    public static C31100h m124663e(@C0359n0 List<Animator> list) {
        C31100h hVar = new C31100h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m124660a(hVar, list.get(i));
        }
        return hVar;
    }

    @C0359n0
    /* renamed from: b */
    public final PropertyValuesHolder[] mo87855b(@C0359n0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31100h)) {
            return false;
        }
        return this.f74439a.equals(((C31100h) obj).f74439a);
    }

    @C0359n0
    /* renamed from: f */
    public <T> ObjectAnimator mo87857f(@C0359n0 String str, @C0359n0 T t, @C0359n0 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo87858g(str));
        ofPropertyValuesHolder.setProperty(property);
        mo87859h(str).mo87867a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @C0359n0
    /* renamed from: g */
    public PropertyValuesHolder[] mo87858g(String str) {
        if (mo87862j(str)) {
            return mo87855b(this.f74440b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public C31101i mo87859h(String str) {
        if (mo87863k(str)) {
            return this.f74439a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f74439a.hashCode();
    }

    /* renamed from: i */
    public long mo87861i() {
        int size = this.f74439a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C31101i o = this.f74439a.mo6338o(i);
            j = Math.max(j, o.mo87868c() + o.mo87869d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean mo87862j(String str) {
        return this.f74440b.get(str) != null;
    }

    /* renamed from: k */
    public boolean mo87863k(String str) {
        return this.f74439a.get(str) != null;
    }

    /* renamed from: l */
    public void mo87864l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f74440b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void mo87865m(String str, @C0363p0 C31101i iVar) {
        this.f74439a.put(str, iVar);
    }

    @C0359n0
    public String toString() {
        return 10 + getClass().getName() + C12361b.f30258i + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f74439a + "}\n";
    }
}
