package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.vm */
public final class C41653vm extends C41410lj<C41653vm, C41629um> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41653vm zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private byte zzh = 2;

    static {
        C41653vm vmVar = new C41653vm();
        zza = vmVar;
        C41410lj.m168023z(C41653vm.class, vmVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C41653vm();
        } else {
            if (i2 == 4) {
                return new C41629um((C41557rm) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
