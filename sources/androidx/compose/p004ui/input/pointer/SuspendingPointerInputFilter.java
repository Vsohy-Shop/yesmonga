package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.collection.C8423g;
import com.carrefour.fid.android.shared.constant.C28539g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11050e;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12156u1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n432#1:674\n433#1:676\n435#1,4:678\n440#1:693\n443#1,3:705\n1182#2:644\n1161#2,2:645\n1182#2:647\n1161#2,2:648\n34#3:650\n34#3:675\n34#3:747\n146#4:651\n460#4,11:652\n492#4,11:663\n146#4:677\n460#4,11:682\n492#4,11:694\n728#4,2:748\n86#5,2:708\n33#5,6:710\n88#5:716\n86#5,2:717\n33#5,6:719\n88#5:725\n33#5,4:729\n38#5:736\n135#6,3:726\n138#6:733\n139#6:735\n140#6:737\n1#7:734\n314#8,9:738\n323#8,2:750\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n*L\n455#1:674\n455#1:676\n455#1:678,4\n455#1:693\n455#1:705,3\n376#1:644\n376#1:645,2\n384#1:647\n384#1:648,2\n432#1:650\n455#1:675\n515#1:747\n433#1:651\n438#1:652,11\n440#1:663,11\n455#1:677\n455#1:682,11\n455#1:694,11\n516#1:748,2\n472#1:708,2\n472#1:710,6\n472#1:716\n483#1:717,2\n483#1:719,6\n483#1:725\n486#1:729,4\n486#1:736\n486#1:726,3\n486#1:733\n486#1:735\n486#1:737\n486#1:734\n513#1:738,9\n513#1:750,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter */
public final class SuspendingPointerInputFilter extends C15467c0 implements C15469d0, C15472e0, C16479d {
    @C12579k

    /* renamed from: d */
    public final C15863c4 f38455d;

    /* renamed from: e */
    public final /* synthetic */ C16479d f38456e;
    @C12579k

    /* renamed from: f */
    public C15491o f38457f;
    @C12579k

    /* renamed from: g */
    public final C8423g<PointerEventHandlerCoroutine<?>> f38458g;
    @C12579k

    /* renamed from: v */
    public final C8423g<PointerEventHandlerCoroutine<?>> f38459v;
    @C12580l

    /* renamed from: w */
    public C15491o f38460w;

    /* renamed from: x */
    public long f38461x;
    @C12579k

    /* renamed from: y */
    public C12074o0 f38462y;

    /* renamed from: z */
    public boolean f38463z;

    @C11363r0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n34#2:644\n735#3,2:645\n314#4,11:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n*L\n582#1:644\n583#1:645,2\n590#1:647,11\n*E\n"})
    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine */
    public final class PointerEventHandlerCoroutine<R> implements C15465c, C16479d, C11045c<R> {
        @C12579k

        /* renamed from: a */
        public final C11045c<R> f38464a;

        /* renamed from: b */
        public final /* synthetic */ SuspendingPointerInputFilter f38465b;
        @C12580l

        /* renamed from: c */
        public C12072o<? super C15491o> f38466c;
        @C12579k

        /* renamed from: d */
        public PointerEventPass f38467d = PointerEventPass.Main;
        @C12579k

        /* renamed from: e */
        public final CoroutineContext f38468e = EmptyCoroutineContext.f28243a;

        /* renamed from: f */
        public final /* synthetic */ SuspendingPointerInputFilter f38469f;

        public PointerEventHandlerCoroutine(@C12579k SuspendingPointerInputFilter suspendingPointerInputFilter, C11045c<? super R> cVar) {
            Intrinsics.checkNotNullParameter(cVar, "completion");
            this.f38469f = suspendingPointerInputFilter;
            this.f38464a = cVar;
            this.f38465b = suspendingPointerInputFilter;
        }

        @C8547h2
        /* renamed from: C2 */
        public float mo7415C2(long j) {
            return this.f38465b.mo7415C2(j);
        }

        @C8547h2
        /* renamed from: L */
        public float mo7416L(int i) {
            return this.f38465b.mo7416L(i);
        }

        @C8547h2
        @C12579k
        /* renamed from: L4 */
        public C15098i mo7417L4(@C12579k C16489j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            return this.f38465b.mo7417L4(jVar);
        }

        @C8547h2
        /* renamed from: M */
        public float mo7418M(float f) {
            return this.f38465b.mo7418M(f);
        }

        /* renamed from: R4 */
        public float mo7419R4() {
            return this.f38465b.mo7419R4();
        }

        @C8547h2
        /* renamed from: V */
        public long mo7420V(long j) {
            return this.f38465b.mo7420V(j);
        }

        /* renamed from: a */
        public long mo44000a() {
            return this.f38469f.f38461x;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @org.jetbrains.annotations.C12580l
        /* renamed from: d1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object mo44001d1(long r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.input.pointer.C15465c, ? super kotlin.coroutines.C11045c<? super T>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.p004ui.input.pointer.C15457x7456dd52
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.p004ui.input.pointer.C15457x7456dd52) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                kotlin.C11661u0.m45747n(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                goto L_0x003e
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                kotlin.C11661u0.m45747n(r8)
                r0.label = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                java.lang.Object r8 = r4.mo44006u2(r5, r7, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                if (r8 != r1) goto L_0x003e
                return r1
            L_0x003d:
                r8 = 0
            L_0x003e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.mo44001d1(long, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
        }

        @C8547h2
        /* renamed from: g5 */
        public float mo7425g5(float f) {
            return this.f38465b.mo7425g5(f);
        }

        @C12579k
        public CoroutineContext getContext() {
            return this.f38468e;
        }

        public float getDensity() {
            return this.f38465b.getDensity();
        }

        @C12579k
        public C15863c4 getViewConfiguration() {
            return this.f38469f.getViewConfiguration();
        }

        @C12580l
        /* renamed from: i3 */
        public Object mo44003i3(@C12579k PointerEventPass pointerEventPass, @C12579k C11045c<? super C15491o> cVar) {
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
            pVar.mo24537e0();
            this.f38467d = pointerEventPass;
            this.f38466c = pVar;
            Object y = pVar.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            return y;
        }

        @C12579k
        /* renamed from: j3 */
        public C15491o mo44004j3() {
            return this.f38469f.f38457f;
        }

        /* renamed from: k */
        public final void mo44005k(@C12580l Throwable th) {
            C12072o<? super C15491o> oVar = this.f38466c;
            if (oVar != null) {
                oVar.mo24535c(th);
            }
            this.f38466c = null;
        }

        @C8547h2
        /* renamed from: m */
        public long mo7427m(float f) {
            return this.f38465b.mo7427m(f);
        }

        @C8547h2
        /* renamed from: n */
        public long mo7428n(long j) {
            return this.f38465b.mo7428n(j);
        }

        @C8547h2
        /* renamed from: n2 */
        public int mo7429n2(float f) {
            return this.f38465b.mo7429n2(f);
        }

        @C8547h2
        /* renamed from: q */
        public float mo7430q(long j) {
            return this.f38465b.mo7430q(j);
        }

        public void resumeWith(@C12579k Object obj) {
            C8423g q2 = this.f38469f.f38458g;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f38469f;
            synchronized (q2) {
                suspendingPointerInputFilter.f38458g.mo15495z0(this);
                C11079d2 d2Var = C11079d2.f28267a;
            }
            this.f38464a.resumeWith(obj);
        }

        @C8547h2
        /* renamed from: t */
        public long mo7431t(int i) {
            return this.f38465b.mo7431t(i);
        }

        @C8547h2
        /* renamed from: u */
        public long mo7432u(float f) {
            return this.f38465b.mo7432u(f);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @org.jetbrains.annotations.C12580l
        /* renamed from: u2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object mo44006u2(long r12, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.input.pointer.C15465c, ? super kotlin.coroutines.C11045c<? super T>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof androidx.compose.p004ui.input.pointer.C15455xffebe5e8
                if (r0 == 0) goto L_0x0013
                r0 = r15
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.p004ui.input.pointer.C15455xffebe5e8) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r11, r15)
            L_0x0018:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r12 = r0.L$0
                kotlinx.coroutines.c2 r12 = (kotlinx.coroutines.C11723c2) r12
                kotlin.C11661u0.m45747n(r15)     // Catch:{ all -> 0x002e }
                goto L_0x0075
            L_0x002e:
                r13 = move-exception
                goto L_0x0079
            L_0x0030:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0038:
                kotlin.C11661u0.m45747n(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L_0x0057
                kotlinx.coroutines.o<? super androidx.compose.ui.input.pointer.o> r15 = r11.f38466c
                if (r15 == 0) goto L_0x0057
                kotlin.Result$a r2 = kotlin.Result.f28060a
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = kotlin.C11661u0.m45734a(r2)
                java.lang.Object r2 = kotlin.Result.m38702b(r2)
                r15.resumeWith(r2)
            L_0x0057:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r15 = r11.f38469f
                kotlinx.coroutines.o0 r5 = r15.mo43998t3()
                r6 = 0
                r7 = 0
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 r8 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                kotlinx.coroutines.c2 r12 = kotlinx.coroutines.C12038j.m48061f(r5, r6, r7, r8, r9, r10)
                r0.L$0 = r12     // Catch:{ all -> 0x002e }
                r0.label = r3     // Catch:{ all -> 0x002e }
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch:{ all -> 0x002e }
                if (r15 != r1) goto L_0x0075
                return r1
            L_0x0075:
                kotlinx.coroutines.C11723c2.C11724a.m46184b(r12, r4, r3, r4)
                return r15
            L_0x0079:
                kotlinx.coroutines.C11723c2.C11724a.m46184b(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.mo44006u2(long, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
        }

        @C8547h2
        /* renamed from: u5 */
        public int mo7433u5(long j) {
            return this.f38465b.mo7433u5(j);
        }

        /* renamed from: w */
        public final void mo44007w(@C12579k C15491o oVar, @C12579k PointerEventPass pointerEventPass) {
            C12072o<? super C15491o> oVar2;
            Intrinsics.checkNotNullParameter(oVar, "event");
            Intrinsics.checkNotNullParameter(pointerEventPass, "pass");
            if (pointerEventPass == this.f38467d && (oVar2 = this.f38466c) != null) {
                this.f38466c = null;
                Result.C10852a aVar = Result.f28060a;
                oVar2.resumeWith(Result.m38702b(oVar));
            }
        }

        /* renamed from: y */
        public long mo44008y() {
            return this.f38469f.mo43999y();
        }
    }

    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$a */
    public /* synthetic */ class C15454a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.input.pointer.PointerEventPass[] r0 = androidx.compose.p004ui.input.pointer.PointerEventPass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p004ui.input.pointer.PointerEventPass.Initial     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p004ui.input.pointer.PointerEventPass.Main     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilter.C15454a.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuspendingPointerInputFilter(C15863c4 c4Var, C16479d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4Var, (i & 2) != 0 ? C16482f.m74434b(1.0f, 0.0f, 2, (Object) null) : dVar);
    }

    /* renamed from: I3 */
    public static /* synthetic */ void m68381I3() {
    }

    @C8547h2
    /* renamed from: C2 */
    public float mo7415C2(long j) {
        return this.f38456e.mo7415C2(j);
    }

    @C12579k
    /* renamed from: C4 */
    public C15467c0 mo43971C4() {
        return this;
    }

    /* renamed from: D1 */
    public void mo43978D1() {
        boolean z;
        C15491o oVar = this.f38460w;
        if (oVar != null) {
            List<C15507w> e = oVar.mo44110e();
            int size = e.size();
            int i = 0;
            while (true) {
                z = true;
                if (i >= size) {
                    break;
                } else if (!(true ^ e.get(i).mo44178r())) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                List<C15507w> e2 = oVar.mo44110e();
                ArrayList arrayList = new ArrayList(e2.size());
                int size2 = e2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C15507w wVar = e2.get(i2);
                    arrayList.add(new C15507w(wVar.mo44176p(), wVar.mo44186z(), wVar.mo44177q(), false, wVar.mo44179s(), wVar.mo44186z(), wVar.mo44177q(), wVar.mo44178r(), wVar.mo44178r(), 0, 0, (int) C28539g.f69265w, (DefaultConstructorMarker) null));
                }
                C15491o oVar2 = new C15491o(arrayList);
                this.f38457f = oVar2;
                mo43991J2(oVar2, PointerEventPass.Initial);
                mo43991J2(oVar2, PointerEventPass.Main);
                mo43991J2(oVar2, PointerEventPass.Final);
                this.f38460w = null;
            }
        }
    }

    /* renamed from: G1 */
    public void mo43979G1(@C12579k C15491o oVar, @C12579k PointerEventPass pointerEventPass, long j) {
        Intrinsics.checkNotNullParameter(oVar, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass, "pass");
        this.f38461x = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f38457f = oVar;
        }
        mo43991J2(oVar, pointerEventPass);
        List<C15507w> e = oVar.mo44110e();
        int size = e.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!C15492p.m68685e(e.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            oVar = null;
        }
        this.f38460w = oVar;
    }

    /* renamed from: J2 */
    public final void mo43991J2(C15491o oVar, PointerEventPass pointerEventPass) {
        synchronized (this.f38458g) {
            C8423g<PointerEventHandlerCoroutine<?>> gVar = this.f38459v;
            gVar.mo15464f(gVar.mo15469h0(), this.f38458g);
        }
        try {
            int i = C15454a.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                C8423g<PointerEventHandlerCoroutine<?>> gVar2 = this.f38459v;
                int h0 = gVar2.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = gVar2.mo15462d0();
                    int i2 = 0;
                    do {
                        ((PointerEventHandlerCoroutine) d0[i2]).mo44007w(oVar, pointerEventPass);
                        i2++;
                    } while (i2 < h0);
                }
            } else if (i == 3) {
                C8423g<PointerEventHandlerCoroutine<?>> gVar3 = this.f38459v;
                int h02 = gVar3.mo15469h0();
                if (h02 > 0) {
                    int i3 = h02 - 1;
                    Object[] d02 = gVar3.mo15462d0();
                    do {
                        ((PointerEventHandlerCoroutine) d02[i3]).mo44007w(oVar, pointerEventPass);
                        i3--;
                    } while (i3 >= 0);
                }
            }
        } finally {
            this.f38459v.mo15490w();
        }
    }

    @C8547h2
    /* renamed from: L */
    public float mo7416L(int i) {
        return this.f38456e.mo7416L(i);
    }

    @C8547h2
    @C12579k
    /* renamed from: L4 */
    public C15098i mo7417L4(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return this.f38456e.mo7417L4(jVar);
    }

    @C8547h2
    /* renamed from: M */
    public float mo7418M(float f) {
        return this.f38456e.mo7418M(f);
    }

    /* renamed from: M2 */
    public void mo43992M2(boolean z) {
        this.f38463z = z;
    }

    /* renamed from: O3 */
    public final void mo43993O3(@C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<set-?>");
        this.f38462y = o0Var;
    }

    @C12580l
    /* renamed from: R0 */
    public <R> Object mo43994R0(@C12579k C11304p<? super C15465c, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar) {
        C12078p pVar2 = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar2.mo24537e0();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, pVar2);
        synchronized (this.f38458g) {
            this.f38458g.mo15463e(pointerEventHandlerCoroutine);
            C11045c<C11079d2> c = C11050e.m42592c(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.C10852a aVar = Result.f28060a;
            c.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
        pVar2.mo24529C(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object y = pVar2.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f38456e.mo7419R4();
    }

    @C8547h2
    /* renamed from: V */
    public long mo7420V(long j) {
        return this.f38456e.mo7420V(j);
    }

    @C8547h2
    /* renamed from: g5 */
    public float mo7425g5(float f) {
        return this.f38456e.mo7425g5(f);
    }

    public float getDensity() {
        return this.f38456e.getDensity();
    }

    @C12579k
    public C15863c4 getViewConfiguration() {
        return this.f38455d;
    }

    /* renamed from: j5 */
    public boolean mo43996j5() {
        return this.f38463z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l3 */
    public final void mo43997l3(PointerEventPass pointerEventPass, C11300l<? super PointerEventHandlerCoroutine<?>, C11079d2> lVar) {
        synchronized (this.f38458g) {
            try {
                C8423g<PointerEventHandlerCoroutine<?>> gVar = this.f38459v;
                gVar.mo15464f(gVar.mo15469h0(), this.f38458g);
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        try {
            int i = C15454a.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                C8423g<PointerEventHandlerCoroutine<?>> gVar2 = this.f38459v;
                int h0 = gVar2.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = gVar2.mo15462d0();
                    int i2 = 0;
                    do {
                        lVar.invoke(d0[i2]);
                        i2++;
                    } while (i2 < h0);
                }
            } else if (i == 3) {
                C8423g<PointerEventHandlerCoroutine<?>> gVar3 = this.f38459v;
                int h02 = gVar3.mo15469h0();
                if (h02 > 0) {
                    int i3 = h02 - 1;
                    Object[] d02 = gVar3.mo15462d0();
                    do {
                        lVar.invoke(d02[i3]);
                        i3--;
                    } while (i3 >= 0);
                }
            }
        } finally {
            C11322b0.m43481d(1);
            this.f38459v.mo15490w();
            C11322b0.m43480c(1);
        }
    }

    @C8547h2
    /* renamed from: m */
    public long mo7427m(float f) {
        return this.f38456e.mo7427m(f);
    }

    @C8547h2
    /* renamed from: n */
    public long mo7428n(long j) {
        return this.f38456e.mo7428n(j);
    }

    @C8547h2
    /* renamed from: n2 */
    public int mo7429n2(float f) {
        return this.f38456e.mo7429n2(f);
    }

    @C8547h2
    /* renamed from: q */
    public float mo7430q(long j) {
        return this.f38456e.mo7430q(j);
    }

    @C8547h2
    /* renamed from: t */
    public long mo7431t(int i) {
        return this.f38456e.mo7431t(i);
    }

    @C12579k
    /* renamed from: t3 */
    public final C12074o0 mo43998t3() {
        return this.f38462y;
    }

    @C8547h2
    /* renamed from: u */
    public long mo7432u(float f) {
        return this.f38456e.mo7432u(f);
    }

    @C8547h2
    /* renamed from: u5 */
    public int mo7433u5(long j) {
        return this.f38456e.mo7433u5(j);
    }

    /* renamed from: y */
    public long mo43999y() {
        long V = mo7420V(getViewConfiguration().mo44721d());
        long a = mo44033a();
        return C15106n.m65033a(Math.max(0.0f, C15104m.m65023t(V) - ((float) C16500q.m74662m(a))) / 2.0f, Math.max(0.0f, C15104m.m65016m(V) - ((float) C16500q.m74659j(a))) / 2.0f);
    }

    public SuspendingPointerInputFilter(@C12579k C15863c4 c4Var, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(c4Var, "viewConfiguration");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f38455d = c4Var;
        this.f38456e = dVar;
        this.f38457f = SuspendingPointerInputFilterKt.f38471b;
        this.f38458g = new C8423g<>(new PointerEventHandlerCoroutine[16], 0);
        this.f38459v = new C8423g<>(new PointerEventHandlerCoroutine[16], 0);
        this.f38461x = C16500q.f40900b.mo47897a();
        this.f38462y = C12156u1.f29939a;
    }
}
