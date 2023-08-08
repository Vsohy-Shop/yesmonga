package com.urbanairship.push.notifications;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0324b1;
import androidx.annotation.C0331e;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.app.C17230s5;

/* renamed from: com.urbanairship.push.notifications.d */
public class C9501d {

    /* renamed from: a */
    public final String f25935a;

    /* renamed from: b */
    public final int f25936b;

    /* renamed from: c */
    public final int[] f25937c;

    /* renamed from: d */
    public final Bundle f25938d;

    /* renamed from: e */
    public final boolean f25939e;

    /* renamed from: f */
    public final int f25940f;

    /* renamed from: com.urbanairship.push.notifications.d$b */
    public static final class C9503b {

        /* renamed from: a */
        public final String f25941a;

        /* renamed from: b */
        public int f25942b;

        /* renamed from: c */
        public int[] f25943c;

        /* renamed from: d */
        public final Bundle f25944d = new Bundle();

        /* renamed from: e */
        public boolean f25945e = false;

        /* renamed from: f */
        public int f25946f;

        public C9503b(@C0359n0 String str) {
            this.f25941a = str;
        }

        @C0359n0
        /* renamed from: g */
        public C9503b mo19288g(@C0363p0 Bundle bundle) {
            if (bundle != null) {
                this.f25944d.putAll(bundle);
            }
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9501d mo19289h() {
            return new C9501d(this);
        }

        @C0359n0
        /* renamed from: i */
        public C9503b mo19290i(boolean z) {
            this.f25945e = z;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9503b mo19291j(@C0331e int i) {
            this.f25943c = null;
            this.f25946f = i;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C9503b mo19292k(@C0324b1 int i) {
            this.f25942b = i;
            return this;
        }
    }

    @C0359n0
    /* renamed from: a */
    public C17230s5 mo19282a(@C0359n0 Context context) {
        C17230s5.C17236f a = new C17230s5.C17236f(this.f25935a).mo51686e(this.f25939e).mo51682a(this.f25938d);
        int[] iArr = this.f25937c;
        if (iArr != null) {
            CharSequence[] charSequenceArr = new CharSequence[iArr.length];
            int i = 0;
            while (true) {
                int[] iArr2 = this.f25937c;
                if (i >= iArr2.length) {
                    break;
                }
                charSequenceArr[i] = context.getText(iArr2[i]);
                i++;
            }
            a.mo51687f(charSequenceArr);
        }
        if (this.f25940f != 0) {
            a.mo51687f(context.getResources().getStringArray(this.f25940f));
        }
        int i2 = this.f25936b;
        if (i2 != 0) {
            a.mo51689h(context.getText(i2));
        }
        return a.mo51683b();
    }

    /* renamed from: b */
    public boolean mo19283b() {
        return this.f25939e;
    }

    @C0363p0
    /* renamed from: c */
    public int[] mo19284c() {
        return this.f25937c;
    }

    @C0359n0
    /* renamed from: d */
    public Bundle mo19285d() {
        return this.f25938d;
    }

    /* renamed from: e */
    public int mo19286e() {
        return this.f25936b;
    }

    @C0359n0
    /* renamed from: f */
    public String mo19287f() {
        return this.f25935a;
    }

    public C9501d(C9503b bVar) {
        this.f25935a = bVar.f25941a;
        this.f25936b = bVar.f25942b;
        this.f25937c = bVar.f25943c;
        this.f25939e = bVar.f25945e;
        this.f25938d = bVar.f25944d;
        this.f25940f = bVar.f25946f;
    }
}
