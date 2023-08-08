package retrofit2;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import kotlin.C11661u0;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "KotlinExtensions")
public final class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C12968a implements C13008d<T> {

        /* renamed from: a */
        public final /* synthetic */ C12072o f31972a;

        public C12968a(C12072o oVar) {
            this.f31972a = oVar;
        }

        /* renamed from: a */
        public void mo30434a(@C12579k C12983b<T> bVar, @C12579k Throwable th) {
            C12072o oVar = this.f31972a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }

        /* renamed from: b */
        public void mo30435b(@C12579k C12983b<T> bVar, @C12579k C13091w<T> wVar) {
            if (wVar.mo30576g()) {
                T a = wVar.mo30572a();
                if (a == null) {
                    Object tag = bVar.request().tag(C13053k.class);
                    if (tag == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(tag, "call.request().tag(Invocation::class.java)!!");
                    Method b = ((C13053k) tag).mo30525b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    Intrinsics.checkExpressionValueIsNotNull(b, FirebaseAnalytics.C32532b.f78973v);
                    Class<?> declaringClass = b.getDeclaringClass();
                    Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(b.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                    C12072o oVar = this.f31972a;
                    Result.C10852a aVar = Result.f28060a;
                    oVar.resumeWith(Result.m38702b(C11661u0.m45734a(kotlinNullPointerException)));
                    return;
                }
                C12072o oVar2 = this.f31972a;
                Result.C10852a aVar2 = Result.f28060a;
                oVar2.resumeWith(Result.m38702b(a));
                return;
            }
            C12072o oVar3 = this.f31972a;
            HttpException httpException = new HttpException(wVar);
            Result.C10852a aVar3 = Result.f28060a;
            oVar3.resumeWith(Result.m38702b(C11661u0.m45734a(httpException)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$b */
    public static final class C12969b implements C13008d<T> {

        /* renamed from: a */
        public final /* synthetic */ C12072o f31973a;

        public C12969b(C12072o oVar) {
            this.f31973a = oVar;
        }

        /* renamed from: a */
        public void mo30434a(@C12579k C12983b<T> bVar, @C12579k Throwable th) {
            C12072o oVar = this.f31973a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }

        /* renamed from: b */
        public void mo30435b(@C12579k C12983b<T> bVar, @C12579k C13091w<T> wVar) {
            if (wVar.mo30576g()) {
                C12072o oVar = this.f31973a;
                T a = wVar.mo30572a();
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(a));
                return;
            }
            C12072o oVar2 = this.f31973a;
            HttpException httpException = new HttpException(wVar);
            Result.C10852a aVar2 = Result.f28060a;
            oVar2.resumeWith(Result.m38702b(C11661u0.m45734a(httpException)));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$c */
    public static final class C12970c implements C13008d<T> {

        /* renamed from: a */
        public final /* synthetic */ C12072o f31974a;

        public C12970c(C12072o oVar) {
            this.f31974a = oVar;
        }

        /* renamed from: a */
        public void mo30434a(@C12579k C12983b<T> bVar, @C12579k Throwable th) {
            C12072o oVar = this.f31974a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }

        /* renamed from: b */
        public void mo30435b(@C12579k C12983b<T> bVar, @C12579k C13091w<T> wVar) {
            C12072o oVar = this.f31974a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(wVar));
        }
    }

    /* renamed from: retrofit2.KotlinExtensions$d */
    public static final class C12971d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C11045c f31975a;

        /* renamed from: b */
        public final /* synthetic */ Exception f31976b;

        public C12971d(C11045c cVar, Exception exc) {
            this.f31975a = cVar;
            this.f31976b = exc;
        }

        public final void run() {
            C11045c d = IntrinsicsKt__IntrinsicsJvmKt.m42608d(this.f31975a);
            Exception exc = this.f31976b;
            Result.C10852a aVar = Result.f28060a;
            d.resumeWith(Result.m38702b(C11661u0.m45734a(exc)));
        }
    }

    @C12580l
    /* renamed from: a */
    public static final <T> Object m56262a(@C12579k C12983b<T> bVar, @C12579k C11045c<? super T> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24529C(new C12972x19835f10(bVar));
        bVar.mo30458k1(new C12968a(pVar));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    @C12580l
    @C11314h(name = "awaitNullable")
    /* renamed from: b */
    public static final <T> Object m56263b(@C12579k C12983b<T> bVar, @C12579k C11045c<? super T> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24529C(new C12973x19835f11(bVar));
        bVar.mo30458k1(new C12969b(pVar));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    @C12580l
    /* renamed from: c */
    public static final <T> Object m56264c(@C12579k C12983b<T> bVar, @C12579k C11045c<? super C13091w<T>> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24529C(new C12974xc95e9eb1(bVar));
        bVar.mo30458k1(new C12970c(pVar));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m56266e(@org.jetbrains.annotations.C12579k java.lang.Exception r4, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.C11661u0.m45747n(r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.C11768d1.m46779a()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$d r3 = new retrofit2.KotlinExtensions$d
            r3.<init>(r0, r4)
            r5.mo23563O(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r4 != r5) goto L_0x0059
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m56266e(java.lang.Exception, kotlin.coroutines.c):java.lang.Object");
    }
}
