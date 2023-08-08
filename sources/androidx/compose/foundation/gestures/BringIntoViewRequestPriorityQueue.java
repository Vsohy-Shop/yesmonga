package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.runtime.collection.C8423g;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlinx.coroutines.C12072o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n1182#2:138\n1161#2,2:139\n53#3:141\n523#3:142\n523#3:143\n492#3,11:144\n53#3:155\n523#3:156\n48#3:157\n664#3,2:158\n523#3:160\n13579#4,2:161\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n72#1:141\n73#1:142\n91#1:143\n107#1:144,11\n111#1:155\n112#1:156\n121#1:157\n132#1:158,2\n132#1:160\n132#1:161,2\n*E\n"})
public final class BringIntoViewRequestPriorityQueue {
    @C12579k

    /* renamed from: a */
    public final C8423g<ContentInViewModifier.C2129a> f5826a = new C8423g<>(new ContentInViewModifier.C2129a[16], 0);

    /* renamed from: b */
    public final void mo7319b(@C12580l Throwable th) {
        C8423g<ContentInViewModifier.C2129a> gVar = this.f5826a;
        int h0 = gVar.mo15469h0();
        C12072o[] oVarArr = new C12072o[h0];
        for (int i = 0; i < h0; i++) {
            oVarArr[i] = ((ContentInViewModifier.C2129a) gVar.mo15462d0()[i]).mo7342a();
        }
        for (int i2 = 0; i2 < h0; i2++) {
            oVarArr[i2].mo24535c(th);
        }
        if (!this.f5826a.mo15476l0()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: c */
    public final boolean mo7320c(@C12579k ContentInViewModifier.C2129a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "request");
        C15098i invoke = aVar.mo7343b().invoke();
        if (invoke == null) {
            C12072o<C11079d2> a = aVar.mo7342a();
            Result.C10852a aVar2 = Result.f28060a;
            a.resumeWith(Result.m38702b(C11079d2.f28267a));
            return false;
        }
        aVar.mo7342a().mo24529C(new BringIntoViewRequestPriorityQueue$enqueue$1(this, aVar));
        C11466l lVar = new C11466l(0, this.f5826a.mo15469h0() - 1);
        int r = lVar.mo23049r();
        int w = lVar.mo23051w();
        if (r <= w) {
            while (true) {
                C15098i invoke2 = ((ContentInViewModifier.C2129a) this.f5826a.mo15462d0()[w]).mo7343b().invoke();
                if (invoke2 != null) {
                    C15098i J = invoke.mo42255J(invoke2);
                    if (Intrinsics.areEqual((Object) J, (Object) invoke)) {
                        this.f5826a.mo15459a(w + 1, aVar);
                        return true;
                    } else if (!Intrinsics.areEqual((Object) J, (Object) invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int h0 = this.f5826a.mo15469h0() - 1;
                        if (h0 <= w) {
                            while (true) {
                                ((ContentInViewModifier.C2129a) this.f5826a.mo15462d0()[w]).mo7342a().mo24535c(cancellationException);
                                if (h0 == w) {
                                    break;
                                }
                                h0++;
                            }
                        }
                    }
                }
                if (w == r) {
                    break;
                }
                w--;
            }
        }
        this.f5826a.mo15459a(0, aVar);
        return true;
    }

    /* renamed from: d */
    public final void mo7321d(@C12579k C11300l<? super C15098i, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8423g a = this.f5826a;
        int h0 = a.mo15469h0();
        if (h0 > 0) {
            int i = h0 - 1;
            Object[] d0 = a.mo15462d0();
            do {
                lVar.invoke(((ContentInViewModifier.C2129a) d0[i]).mo7343b().invoke());
                i--;
            } while (i >= 0);
        }
    }

    /* renamed from: e */
    public final int mo7322e() {
        return this.f5826a.mo15469h0();
    }

    /* renamed from: f */
    public final boolean mo7323f() {
        return this.f5826a.mo15476l0();
    }

    /* renamed from: g */
    public final void mo7324g() {
        C11466l lVar = new C11466l(0, this.f5826a.mo15469h0() - 1);
        int r = lVar.mo23049r();
        int w = lVar.mo23051w();
        if (r <= w) {
            while (true) {
                C12072o<C11079d2> a = ((ContentInViewModifier.C2129a) this.f5826a.mo15462d0()[r]).mo7342a();
                C11079d2 d2Var = C11079d2.f28267a;
                Result.C10852a aVar = Result.f28060a;
                a.resumeWith(Result.m38702b(d2Var));
                if (r == w) {
                    break;
                }
                r++;
            }
        }
        this.f5826a.mo15490w();
    }

    /* renamed from: h */
    public final void mo7325h(@C12579k C11300l<? super C15098i, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        while (this.f5826a.mo15477m0() && lVar.invoke(((ContentInViewModifier.C2129a) this.f5826a.mo15478n0()).mo7343b().invoke()).booleanValue()) {
            C12072o<C11079d2> a = ((ContentInViewModifier.C2129a) this.f5826a.mo15437D0(this.f5826a.mo15469h0() - 1)).mo7342a();
            C11079d2 d2Var = C11079d2.f28267a;
            Result.C10852a aVar = Result.f28060a;
            a.resumeWith(Result.m38702b(d2Var));
        }
    }
}
