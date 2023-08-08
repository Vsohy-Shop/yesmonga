package kotlinx.coroutines;

import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11050e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.intrinsics.C12036a;
import kotlinx.coroutines.intrinsics.C12037b;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118FX\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, mo22516d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "completion", "Lkotlin/d2;", "q", "(Lkotlin/jvm/functions/l;Lkotlin/coroutines/c;)V", "R", "Lkotlin/Function2;", "Lkotlin/t;", "receiver", "r", "(Lkotlin/jvm/functions/p;Ljava/lang/Object;Lkotlin/coroutines/c;)V", "", "w", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "kotlinx-coroutines-core"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: kotlinx.coroutines.CoroutineStart$a */
    public /* synthetic */ class C11693a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineStart.C11693a.<clinit>():void");
        }
    }

    @C12177y1
    /* renamed from: q */
    public final <T> void mo23570q(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar, @C12579k C11045c<? super T> cVar) {
        int i = C11693a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            C12036a.m48046d(lVar, cVar);
        } else if (i == 2) {
            C11050e.m42597h(lVar, cVar);
        } else if (i == 3) {
            C12037b.m48049a(lVar, cVar);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12177y1
    /* renamed from: r */
    public final <R, T> void mo23571r(@C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar, R r, @C12579k C11045c<? super T> cVar) {
        int i = C11693a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            C12036a.m48048f(pVar, r, cVar, (C11300l) null, 4, (Object) null);
        } else if (i == 2) {
            C11050e.m42598i(pVar, r, cVar);
        } else if (i == 3) {
            C12037b.m48050b(pVar, r, cVar);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: w */
    public final boolean mo23572w() {
        return this == LAZY;
    }
}
