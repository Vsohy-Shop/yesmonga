package kotlin.sequences;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Iterator;
import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11665v0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.q */
public class C11563q {

    /* renamed from: a */
    public static final int f28741a = 0;

    /* renamed from: b */
    public static final int f28742b = 1;

    /* renamed from: c */
    public static final int f28743c = 2;

    /* renamed from: d */
    public static final int f28744d = 3;

    /* renamed from: e */
    public static final int f28745e = 4;

    /* renamed from: f */
    public static final int f28746f = 5;

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    /* renamed from: kotlin.sequences.q$a */
    public static final class C11564a implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ C11304p f28747a;

        public C11564a(C11304p pVar) {
            this.f28747a = pVar;
        }

        @C12579k
        public Iterator<T> iterator() {
            return C11563q.m44901a(this.f28747a);
        }
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: a */
    public static final <T> Iterator<T> m44901a(@C12579k @C10863b C11304p<? super C11561o<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        C11560n nVar = new C11560n();
        nVar.mo23257o(IntrinsicsKt__IntrinsicsJvmKt.m42607c(pVar, nVar, nVar));
        return nVar;
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b */
    public static final <T> C11559m<T> m44902b(@C12579k @C10863b C11304p<? super C11561o<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        return new C11564a(pVar);
    }
}
