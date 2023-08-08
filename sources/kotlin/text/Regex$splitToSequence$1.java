package kotlin.text;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.sequences.C11561o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.text.Regex$splitToSequence$1", mo22502f = "Regex.kt", mo22503i = {1, 1, 1}, mo22504l = {276, 284, 288}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "matcher", "splitCount"}, mo22507s = {"L$0", "L$1", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/sequences/o;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super String>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, C11045c<? super Regex$splitToSequence$1> cVar) {
        super(2, cVar);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, cVar);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super String> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((Regex$splitToSequence$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 == r4) goto L_0x002e
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.C11661u0.m45747n(r11)
            goto L_0x009f
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001e:
            int r1 = r10.I$0
            java.lang.Object r5 = r10.L$1
            java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
            java.lang.Object r6 = r10.L$0
            kotlin.sequences.o r6 = (kotlin.sequences.C11561o) r6
            kotlin.C11661u0.m45747n(r11)
            r7 = r10
            r11 = r5
            goto L_0x0073
        L_0x002e:
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00b1
        L_0x0033:
            kotlin.C11661u0.m45747n(r11)
            java.lang.Object r11 = r10.L$0
            kotlin.sequences.o r11 = (kotlin.sequences.C11561o) r11
            kotlin.text.Regex r1 = r10.this$0
            java.util.regex.Pattern r1 = r1.nativePattern
            java.lang.CharSequence r5 = r10.$input
            java.util.regex.Matcher r1 = r1.matcher(r5)
            int r5 = r10.$limit
            if (r5 == r4) goto L_0x00a2
            boolean r5 = r1.find()
            if (r5 != 0) goto L_0x0051
            goto L_0x00a2
        L_0x0051:
            r5 = 0
            r7 = r10
            r6 = r11
            r11 = r1
            r1 = r5
        L_0x0056:
            java.lang.CharSequence r8 = r7.$input
            int r9 = r11.start()
            java.lang.CharSequence r5 = r8.subSequence(r5, r9)
            java.lang.String r5 = r5.toString()
            r7.L$0 = r6
            r7.L$1 = r11
            r7.I$0 = r1
            r7.label = r3
            java.lang.Object r5 = r6.mo23250b(r5, r7)
            if (r5 != r0) goto L_0x0073
            return r0
        L_0x0073:
            int r5 = r11.end()
            int r1 = r1 + r4
            int r8 = r7.$limit
            int r8 = r8 - r4
            if (r1 == r8) goto L_0x0083
            boolean r8 = r11.find()
            if (r8 != 0) goto L_0x0056
        L_0x0083:
            java.lang.CharSequence r11 = r7.$input
            int r1 = r11.length()
            java.lang.CharSequence r11 = r11.subSequence(r5, r1)
            java.lang.String r11 = r11.toString()
            r1 = 0
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r11 = r6.mo23250b(r11, r7)
            if (r11 != r0) goto L_0x009f
            return r0
        L_0x009f:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x00a2:
            java.lang.CharSequence r1 = r10.$input
            java.lang.String r1 = r1.toString()
            r10.label = r4
            java.lang.Object r11 = r11.mo23250b(r1, r10)
            if (r11 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
