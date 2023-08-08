package kotlin.jvm.internal;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.reflect.C11523t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lkotlin/reflect/t;", "it", "", "a", "(Lkotlin/reflect/t;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TypeReference$asString$args$1 extends Lambda implements C11300l<C11523t, CharSequence> {
    final /* synthetic */ TypeReference this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeReference$asString$args$1(TypeReference typeReference) {
        super(1);
        this.this$0 = typeReference;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k C11523t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "it");
        return this.this$0.mo22757h(tVar);
    }
}
