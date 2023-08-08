package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.common.C41107i;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.dynamic.c */
public interface C41014c extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.c$a */
    public static abstract class C41015a extends C41107i implements C41014c {
        public C41015a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @C0359n0
        /* renamed from: H0 */
        public static C41014c m166797H0(@C0359n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof C41014c) {
                return (C41014c) queryLocalInterface;
            }
            return new C41030q(iBinder);
        }

        /* renamed from: m0 */
        public final boolean mo134408m0(int i, @C0359n0 Parcel parcel, @C0359n0 Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    C41016d h = mo134826h();
                    parcel2.writeNoException();
                    C41108j.m166987f(parcel2, h);
                    return true;
                case 3:
                    Bundle e = mo134823e();
                    parcel2.writeNoException();
                    C41108j.m166986e(parcel2, e);
                    return true;
                case 4:
                    int zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 5:
                    C41014c f = mo134824f();
                    parcel2.writeNoException();
                    C41108j.m166987f(parcel2, f);
                    return true;
                case 6:
                    C41016d j = mo134827j();
                    parcel2.writeNoException();
                    C41108j.m166987f(parcel2, j);
                    return true;
                case 7:
                    boolean Q0 = mo134816Q0();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, Q0);
                    return true;
                case 8:
                    String p = mo134832p();
                    parcel2.writeNoException();
                    parcel2.writeString(p);
                    return true;
                case 9:
                    C41014c o = mo134831o();
                    parcel2.writeNoException();
                    C41108j.m166987f(parcel2, o);
                    return true;
                case 10:
                    int d = mo134822d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d);
                    return true;
                case 11:
                    boolean V0 = mo134820V0();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, V0);
                    return true;
                case 12:
                    C41016d k = mo134828k();
                    parcel2.writeNoException();
                    C41108j.m166987f(parcel2, k);
                    return true;
                case 13:
                    boolean G0 = mo134813G0();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, G0);
                    return true;
                case 14:
                    boolean R = mo134817R();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, R);
                    return true;
                case 15:
                    boolean a0 = mo134821a0();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, a0);
                    return true;
                case 16:
                    boolean J = mo134815J();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, J);
                    return true;
                case 17:
                    boolean U = mo134819U();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, U);
                    return true;
                case 18:
                    boolean F = mo134812F();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, F);
                    return true;
                case 19:
                    boolean D = mo134811D();
                    parcel2.writeNoException();
                    C41108j.m166984c(parcel2, D);
                    return true;
                case 20:
                    C41016d H0 = C41016d.C41017a.m166799H0(parcel.readStrongBinder());
                    C41108j.m166983b(parcel);
                    mo134835u7(H0);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean g = C41108j.m166988g(parcel);
                    C41108j.m166983b(parcel);
                    mo134829n0(g);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean g2 = C41108j.m166988g(parcel);
                    C41108j.m166983b(parcel);
                    mo134833u5(g2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean g3 = C41108j.m166988g(parcel);
                    C41108j.m166983b(parcel);
                    mo134818S5(g3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean g4 = C41108j.m166988g(parcel);
                    C41108j.m166983b(parcel);
                    mo134825g8(g4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    C41108j.m166983b(parcel);
                    mo134830n6((Intent) C41108j.m166982a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    int readInt = parcel.readInt();
                    C41108j.m166983b(parcel);
                    mo134834u6((Intent) C41108j.m166982a(parcel, Intent.CREATOR), readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    C41016d H02 = C41016d.C41017a.m166799H0(parcel.readStrongBinder());
                    C41108j.m166983b(parcel);
                    mo134814G3(H02);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: D */
    boolean mo134811D() throws RemoteException;

    /* renamed from: F */
    boolean mo134812F() throws RemoteException;

    /* renamed from: G0 */
    boolean mo134813G0() throws RemoteException;

    /* renamed from: G3 */
    void mo134814G3(@C0359n0 C41016d dVar) throws RemoteException;

    /* renamed from: J */
    boolean mo134815J() throws RemoteException;

    /* renamed from: Q0 */
    boolean mo134816Q0() throws RemoteException;

    /* renamed from: R */
    boolean mo134817R() throws RemoteException;

    /* renamed from: S5 */
    void mo134818S5(boolean z) throws RemoteException;

    /* renamed from: U */
    boolean mo134819U() throws RemoteException;

    /* renamed from: V0 */
    boolean mo134820V0() throws RemoteException;

    /* renamed from: a0 */
    boolean mo134821a0() throws RemoteException;

    /* renamed from: d */
    int mo134822d() throws RemoteException;

    @C0363p0
    /* renamed from: e */
    Bundle mo134823e() throws RemoteException;

    @C0363p0
    /* renamed from: f */
    C41014c mo134824f() throws RemoteException;

    /* renamed from: g8 */
    void mo134825g8(boolean z) throws RemoteException;

    @C0359n0
    /* renamed from: h */
    C41016d mo134826h() throws RemoteException;

    @C0359n0
    /* renamed from: j */
    C41016d mo134827j() throws RemoteException;

    @C0359n0
    /* renamed from: k */
    C41016d mo134828k() throws RemoteException;

    /* renamed from: n0 */
    void mo134829n0(boolean z) throws RemoteException;

    /* renamed from: n6 */
    void mo134830n6(@C0359n0 Intent intent) throws RemoteException;

    @C0363p0
    /* renamed from: o */
    C41014c mo134831o() throws RemoteException;

    @C0363p0
    /* renamed from: p */
    String mo134832p() throws RemoteException;

    /* renamed from: u5 */
    void mo134833u5(boolean z) throws RemoteException;

    /* renamed from: u6 */
    void mo134834u6(@C0359n0 Intent intent, int i) throws RemoteException;

    /* renamed from: u7 */
    void mo134835u7(@C0359n0 C41016d dVar) throws RemoteException;

    int zzb() throws RemoteException;
}
