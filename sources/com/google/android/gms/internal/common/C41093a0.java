package com.google.android.gms.internal.common;

/* renamed from: com.google.android.gms.internal.common.a0 */
public final class C41093a0 extends C41099d0 {

    /* renamed from: v */
    public final /* synthetic */ C41095b0 f104382v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41093a0(C41095b0 b0Var, C41101e0 e0Var, CharSequence charSequence) {
        super(e0Var, charSequence);
        this.f104382v = b0Var;
    }

    /* renamed from: d */
    public final int mo134908d(int i) {
        return i + 1;
    }

    /* renamed from: e */
    public final int mo134909e(int i) {
        C41120v vVar = this.f104382v.f104386a;
        CharSequence charSequence = this.f104389c;
        int length = charSequence.length();
        C41124z.m166999b(i, length, "index");
        while (i < length) {
            if (vVar.mo134937a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
