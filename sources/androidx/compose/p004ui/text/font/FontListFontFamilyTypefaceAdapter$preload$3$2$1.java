package androidx.compose.p004ui.text.font;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", mo22502f = "FontListFontFamilyTypefaceAdapter.kt", mo22503i = {}, mo22504l = {103}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1 */
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Object>, Object> {
    final /* synthetic */ C16238t $font;
    final /* synthetic */ C16227o0 $resourceLoader;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    @C11067d(mo22501c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", mo22502f = "FontListFontFamilyTypefaceAdapter.kt", mo22503i = {}, mo22504l = {105}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H@"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1 */
    public static final class C161731 extends SuspendLambda implements C11300l<C11045c<? super Object>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
            return new C161731(tVar, o0Var, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final C16227o0 o0Var = o0Var;
                final C16238t tVar = tVar;
                C161741 r7 = new C11304p<C12074o0, C11045c<? super Object>, Object>((C11045c<? super C161741>) null) {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, C16238t tVar, C16227o0 o0Var, C11045c<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> cVar) {
                            super(2, cVar);
                            this.this$0 = fontListFontFamilyTypefaceAdapter;
                            this.$font = tVar;
                            this.$resourceLoader = o0Var;
                        }

                        @C12579k
                        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                            return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, cVar);
                        }

                        @C12580l
                        public final Object invokeSuspend(@C12579k Object obj) {
                            Object h = C11063b.m42612h();
                            int i = this.label;
                            if (i == 0) {
                                C11661u0.m45747n(obj);
                                AsyncTypefaceCache b = this.this$0.f40226a;
                                final C16238t tVar = this.$font;
                                final C16227o0 o0Var = this.$resourceLoader;
                                C161731 r7 = new C161731((C11045c<? super C161731>) null);
                                this.label = 1;
                                obj = b.mo46768g(tVar, o0Var, true, r7, this);
                                if (obj == h) {
                                    return h;
                                }
                            } else if (i == 1) {
                                C11661u0.m45747n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return obj;
                        }

                        @C12580l
                        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<Object> cVar) {
                            return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                        }
                    }
