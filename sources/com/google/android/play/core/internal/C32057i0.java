package com.google.android.play.core.internal;

import java.io.File;

/* renamed from: com.google.android.play.core.internal.i0 */
public final class C32057i0 implements C32033b0 {

    /* renamed from: a */
    public final /* synthetic */ int f78264a = 0;

    public C32057i0() {
    }

    /* renamed from: a */
    public final boolean mo92730a(Object obj, File file, File file2) {
        int i = this.f78264a;
        if (i == 0) {
            try {
                return !((Boolean) C32063k0.m129853f(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
            } catch (ClassNotFoundException unused) {
                return false;
            }
        } else if (i != 1) {
            return true;
        } else {
            return new File((String) C32063k0.m129854g(obj.getClass(), String.class, File.class, file, File.class, file2)).exists();
        }
    }

    public C32057i0(byte[] bArr) {
    }

    public C32057i0(char[] cArr) {
    }
}
