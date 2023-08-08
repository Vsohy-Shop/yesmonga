package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.C22270s;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.bumptech.glide.load.d */
public class C22109d<T> implements C22280i<T> {

    /* renamed from: c */
    public final Collection<? extends C22280i<T>> f56792c;

    @SafeVarargs
    public C22109d(@C0359n0 C22280i<T>... iVarArr) {
        if (iVarArr.length != 0) {
            this.f56792c = Arrays.asList(iVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @C0359n0
    /* renamed from: a */
    public C22270s<T> mo65776a(@C0359n0 Context context, @C0359n0 C22270s<T> sVar, int i, int i2) {
        C22270s<T> sVar2 = sVar;
        for (C22280i a : this.f56792c) {
            C22270s<T> a2 = a.mo65776a(context, sVar2, i, i2);
            if (sVar2 != null && !sVar2.equals(sVar) && !sVar2.equals(a2)) {
                sVar2.mo66175a();
            }
            sVar2 = a2;
        }
        return sVar2;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        for (C22280i b : this.f56792c) {
            b.mo65773b(messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22109d) {
            return this.f56792c.equals(((C22109d) obj).f56792c);
        }
        return false;
    }

    public int hashCode() {
        return this.f56792c.hashCode();
    }

    public C22109d(@C0359n0 Collection<? extends C22280i<T>> collection) {
        if (!collection.isEmpty()) {
            this.f56792c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
