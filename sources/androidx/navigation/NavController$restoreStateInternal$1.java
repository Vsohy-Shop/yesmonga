package androidx.navigation;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$restoreStateInternal$1 extends Lambda implements C11300l<String, Boolean> {
    final /* synthetic */ String $backStackId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$restoreStateInternal$1(String str) {
        super(1);
        this.$backStackId = str;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12580l String str) {
        return Boolean.valueOf(Intrinsics.areEqual((Object) str, (Object) this.$backStackId));
    }
}
