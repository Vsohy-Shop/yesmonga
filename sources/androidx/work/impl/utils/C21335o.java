package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.C0843a;
import androidx.lifecycle.C19406e0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.LiveData;
import androidx.work.impl.utils.taskexecutor.C21345b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.o */
public class C21335o {

    /* renamed from: androidx.work.impl.utils.o$a */
    public class C21336a implements C19426h0<In> {

        /* renamed from: a */
        public Out f55041a = null;

        /* renamed from: b */
        public final /* synthetic */ C21345b f55042b;

        /* renamed from: c */
        public final /* synthetic */ Object f55043c;

        /* renamed from: d */
        public final /* synthetic */ C0843a f55044d;

        /* renamed from: e */
        public final /* synthetic */ C19406e0 f55045e;

        /* renamed from: androidx.work.impl.utils.o$a$a */
        public class C21337a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f55046a;

            public C21337a(Object obj) {
                this.f55046a = obj;
            }

            public void run() {
                synchronized (C21336a.this.f55043c) {
                    Out apply = C21336a.this.f55044d.apply(this.f55046a);
                    C21336a aVar = C21336a.this;
                    Out out = aVar.f55041a;
                    if (out == null && apply != null) {
                        aVar.f55041a = apply;
                        aVar.f55045e.mo57493o(apply);
                    } else if (out != null && !out.equals(apply)) {
                        C21336a aVar2 = C21336a.this;
                        aVar2.f55041a = apply;
                        aVar2.f55045e.mo57493o(apply);
                    }
                }
            }
        }

        public C21336a(C21345b bVar, Object obj, C0843a aVar, C19406e0 e0Var) {
            this.f55042b = bVar;
            this.f55043c = obj;
            this.f55044d = aVar;
            this.f55045e = e0Var;
        }

        /* renamed from: a */
        public void mo4590a(@C0363p0 In in) {
            this.f55042b.mo63700c(new C21337a(in));
        }
    }

    @SuppressLint({"LambdaLast"})
    @C0359n0
    /* renamed from: a */
    public static <In, Out> LiveData<Out> m98451a(@C0359n0 LiveData<In> liveData, @C0359n0 C0843a<In, Out> aVar, @C0359n0 C21345b bVar) {
        Object obj = new Object();
        C19406e0 e0Var = new C19406e0();
        e0Var.mo4611s(liveData, new C21336a(bVar, obj, aVar, e0Var));
        return e0Var;
    }
}
