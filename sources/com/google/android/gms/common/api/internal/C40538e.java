package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C40843u;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.e */
public class C40538e {

    @C40473a
    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    public interface C40540b<R> {
        @C40473a
        /* renamed from: a */
        void mo85669a(@C0359n0 R r);

        @C40473a
        /* renamed from: b */
        void mo85730b(@C0359n0 Status status);
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    public static abstract class C40539a<R extends C40669r, A extends C40477a.C40479b> extends BasePendingResult<R> implements C40540b<R> {
        @C40473a

        /* renamed from: r */
        public final C40477a.C40480c<A> f103343r;
        @C0363p0
        @C40473a

        /* renamed from: s */
        public final C40477a<?> f103344s;

        @C40473a
        @Deprecated
        public C40539a(@C0359n0 C40477a.C40480c<A> cVar, @C0359n0 C40507i iVar) {
            super((C40507i) C40843u.m166203m(iVar, "GoogleApiClient must not be null"));
            this.f103343r = (C40477a.C40480c) C40843u.m166202l(cVar);
            this.f103344s = null;
        }

        @C40473a
        /* renamed from: A */
        public final void mo133870A(@C0359n0 A a) throws DeadObjectException {
            try {
                mo133872w(a);
            } catch (DeadObjectException e) {
                mo133871B(e);
                throw e;
            } catch (RemoteException e2) {
                mo133871B(e2);
            }
        }

        @C40473a
        /* renamed from: B */
        public final void mo133871B(@C0359n0 RemoteException remoteException) {
            mo85730b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @C40473a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo85669a(@C0359n0 Object obj) {
            super.mo133793o((C40669r) obj);
        }

        @C40473a
        /* renamed from: b */
        public final void mo85730b(@C0359n0 Status status) {
            C40843u.m166192b(!status.mo133655p0(), "Failed result must not be success");
            C40669r k = mo133688k(status);
            mo133793o(k);
            mo133875z(k);
        }

        @C40473a
        /* renamed from: w */
        public abstract void mo133872w(@C0359n0 A a) throws RemoteException;

        @C0363p0
        @C40473a
        /* renamed from: x */
        public final C40477a<?> mo133873x() {
            return this.f103344s;
        }

        @C40473a
        @C0359n0
        /* renamed from: y */
        public final C40477a.C40480c<A> mo133874y() {
            return this.f103343r;
        }

        @C40473a
        /* renamed from: z */
        public void mo133875z(@C0359n0 R r) {
        }

        @C40473a
        public C40539a(@C0359n0 C40477a<?> aVar, @C0359n0 C40507i iVar) {
            super((C40507i) C40843u.m166203m(iVar, "GoogleApiClient must not be null"));
            C40843u.m166203m(aVar, "Api must not be null");
            this.f103343r = aVar.mo133661b();
            this.f103344s = aVar;
        }

        @C40473a
        @C0344h1
        public C40539a(@C0359n0 BasePendingResult.C40511a<R> aVar) {
            super(aVar);
            this.f103343r = new C40477a.C40480c<>();
            this.f103344s = null;
        }
    }
}
