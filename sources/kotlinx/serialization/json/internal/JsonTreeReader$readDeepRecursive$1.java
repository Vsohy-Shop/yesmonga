package kotlinx.serialization.json.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11102i;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", mo22502f = "JsonTreeReader.kt", mo22503i = {}, mo22504l = {112}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@"}, mo22516d2 = {"Lkotlin/i;", "Lkotlin/d2;", "Lkotlinx/serialization/json/k;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements C11305q<C11102i<C11079d2, C12403k>, C11079d2, C11045c<? super C12403k>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, C11045c<? super JsonTreeReader$readDeepRecursive$1> cVar) {
        super(3, cVar);
        this.this$0 = jsonTreeReader;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11102i<C11079d2, C12403k> iVar, @C12579k C11079d2 d2Var, @C12580l C11045c<? super C12403k> cVar) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, cVar);
        jsonTreeReader$readDeepRecursive$1.L$0 = iVar;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11102i iVar = (C11102i) this.L$0;
            byte G = this.this$0.f30231a.mo25420G();
            if (G == 1) {
                return this.this$0.mo25411k(true);
            }
            if (G == 0) {
                return this.this$0.mo25411k(false);
            }
            if (G == 6) {
                JsonTreeReader jsonTreeReader = this.this$0;
                this.label = 1;
                obj = jsonTreeReader.mo25408h(iVar, this);
                if (obj == h) {
                    return h;
                }
            } else if (G == 8) {
                return this.this$0.mo25406f();
            } else {
                C12359a.m49866x(this.this$0.f30231a, "Can't begin reading element, unexpected token", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (C12403k) obj;
    }
}
