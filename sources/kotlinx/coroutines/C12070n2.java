package kotlinx.coroutines;

import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C12021u;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1364#1:1455,6\n*E\n"})
/* renamed from: kotlinx.coroutines.n2 */
public final class C12070n2 extends C12021u implements C12166w1 {
    @C12579k
    /* renamed from: D */
    public final String mo24528D(@C12579k String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object m = mo24314m();
        Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z = true;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m; !Intrinsics.areEqual((Object) lockFreeLinkedListNode, (Object) this); lockFreeLinkedListNode = lockFreeLinkedListNode.mo24315n()) {
            if (lockFreeLinkedListNode instanceof C11974i2) {
                C11974i2 i2Var = (C11974i2) lockFreeLinkedListNode;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(i2Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C12579k
    /* renamed from: a */
    public C12070n2 mo23671a() {
        return this;
    }

    /* renamed from: d */
    public boolean mo23674d() {
        return true;
    }

    @C12579k
    public String toString() {
        return super.toString();
    }
}
