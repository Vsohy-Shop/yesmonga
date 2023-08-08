package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.util.C22635o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.signature.a */
public final class C22609a implements C22108c {

    /* renamed from: c */
    public final int f57983c;

    /* renamed from: d */
    public final C22108c f57984d;

    public C22609a(int i, C22108c cVar) {
        this.f57983c = i;
        this.f57984d = cVar;
    }

    @C0359n0
    /* renamed from: c */
    public static C22108c m102563c(@C0359n0 Context context) {
        return new C22609a(context.getResources().getConfiguration().uiMode & 48, C22610b.m102567c(context));
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        this.f57984d.mo65773b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f57983c).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22609a)) {
            return false;
        }
        C22609a aVar = (C22609a) obj;
        if (this.f57983c != aVar.f57983c || !this.f57984d.equals(aVar.f57984d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C22635o.m102642q(this.f57984d, this.f57983c);
    }
}
