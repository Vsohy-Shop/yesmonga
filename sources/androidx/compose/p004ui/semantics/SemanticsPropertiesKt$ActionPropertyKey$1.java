package androidx.compose.p004ui.semantics;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Lkotlin/u;", "", "T", "Landroidx/compose/ui/semantics/a;", "parentValue", "childValue", "a", "(Landroidx/compose/ui/semantics/a;Landroidx/compose/ui/semantics/a;)Landroidx/compose/ui/semantics/a;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1195:1\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements C11304p<C16023a<T>, C16023a<T>, C16023a<T>> {

    /* renamed from: f */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f39764f = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final C16023a<T> invoke(@C12580l C16023a<T> aVar, @C12579k C16023a<T> aVar2) {
        String str;
        T t;
        Intrinsics.checkNotNullParameter(aVar2, "childValue");
        if (aVar == null || (str = aVar.mo46089b()) == null) {
            str = aVar2.mo46089b();
        }
        if (aVar == null || (t = aVar.mo46088a()) == null) {
            t = aVar2.mo46088a();
        }
        return new C16023a<>(str, t);
    }
}
