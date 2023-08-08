package com.carrefour.fid.android.presentation.viewmodels.rating;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.rating.GetRatingUseCase;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.google.android.play.core.review.ReviewInfo;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0016B!\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel$b;", "intent", "Lkotlin/d2;", "k0", "(Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "j0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "selectedRating", "i0", "(ILkotlin/coroutines/c;)Ljava/lang/Object;", "", "h0", "g0", "Lcom/carrefour/fid/android/domain/interactors/rating/GetRatingUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/rating/GetRatingUseCase;", "getRatingUseCase", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "b", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "appPreferencesStorage", "Lcom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage;", "c", "Lcom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage;", "catalogPreferencesStorage", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/rating/GetRatingUseCase;Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;Lcom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class RatingViewModel extends BaseMVIViewModel<C27377a, C27382b> {

    /* renamed from: d */
    public static final int f66436d = 8;
    @C12579k

    /* renamed from: a */
    public final GetRatingUseCase f66437a;
    @C12579k

    /* renamed from: b */
    public final AppPreferencesStorage f66438b;
    @C12579k

    /* renamed from: c */
    public final CatalogPreferencesStorage f66439c;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a */
    public static abstract class C27377a implements C28505u.C28509d {

        /* renamed from: b */
        public static final int f66440b = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$a */
        public static final class C27378a extends C27377a {

            /* renamed from: d */
            public static final int f66441d = 8;
            @C12579k

            /* renamed from: c */
            public final ReviewInfo f66442c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27378a(@C12579k ReviewInfo reviewInfo) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
                this.f66442c = reviewInfo;
            }

            /* renamed from: g */
            public static /* synthetic */ C27378a m115378g(C27378a aVar, ReviewInfo reviewInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    reviewInfo = aVar.f66442c;
                }
                return aVar.mo79672f(reviewInfo);
            }

            @C12579k
            /* renamed from: e */
            public final ReviewInfo mo79670e() {
                return this.f66442c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27378a) && Intrinsics.areEqual((Object) this.f66442c, (Object) ((C27378a) obj).f66442c);
            }

            @C12579k
            /* renamed from: f */
            public final C27378a mo79672f(@C12579k ReviewInfo reviewInfo) {
                Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
                return new C27378a(reviewInfo);
            }

            @C12579k
            /* renamed from: h */
            public final ReviewInfo mo79673h() {
                return this.f66442c;
            }

            public int hashCode() {
                return this.f66442c.hashCode();
            }

            @C12579k
            public String toString() {
                ReviewInfo reviewInfo = this.f66442c;
                return "AppRatingInfo(reviewInfo=" + reviewInfo + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$b */
        public static final class C27379b extends C27377a {
            @C12579k

            /* renamed from: c */
            public static final C27379b f66443c = new C27379b();

            /* renamed from: d */
            public static final int f66444d = 0;

            public C27379b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$c */
        public static final class C27380c extends C27377a {

            /* renamed from: d */
            public static final int f66445d = 8;
            @C12579k

            /* renamed from: c */
            public final Throwable f66446c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27380c(@C12579k Throwable th) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f66446c = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C27380c m115382g(C27380c cVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = cVar.f66446c;
                }
                return cVar.mo79678f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo79676e() {
                return this.f66446c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27380c) && Intrinsics.areEqual((Object) this.f66446c, (Object) ((C27380c) obj).f66446c);
            }

            @C12579k
            /* renamed from: f */
            public final C27380c mo79678f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C27380c(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo79679h() {
                return this.f66446c;
            }

            public int hashCode() {
                return this.f66446c.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f66446c;
                return "ErrorState(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$d */
        public static final class C27381d extends C27377a {
            @C12579k

            /* renamed from: c */
            public static final C27381d f66447c = new C27381d();

            /* renamed from: d */
            public static final int f66448d = 0;

            public C27381d() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27377a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        public C27377a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$b */
    public static abstract class C27382b implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f66449a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$b$a */
        public static final class C27383a extends C27382b {
            @C12579k

            /* renamed from: b */
            public static final C27383a f66450b = new C27383a();

            /* renamed from: c */
            public static final int f66451c = 0;

            public C27383a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$b$b */
        public static final class C27384b extends C27382b {

            /* renamed from: c */
            public static final int f66452c = 0;

            /* renamed from: b */
            public final int f66453b;

            public C27384b() {
                this(0, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public final int mo79682a() {
                return this.f66453b;
            }

            public C27384b(int i) {
                super((DefaultConstructorMarker) null);
                this.f66453b = i;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27384b(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -1 : i);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$b$c */
        public static final class C27385c extends C27382b {
            @C12579k

            /* renamed from: b */
            public static final C27385c f66454b = new C27385c();

            /* renamed from: c */
            public static final int f66455c = 0;

            public C27385c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27382b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27382b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public RatingViewModel(@C12579k GetRatingUseCase getRatingUseCase, @C12579k AppPreferencesStorage appPreferencesStorage, @C12579k CatalogPreferencesStorage catalogPreferencesStorage) {
        super(C27377a.C27379b.f66443c, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getRatingUseCase, "getRatingUseCase");
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        Intrinsics.checkNotNullParameter(catalogPreferencesStorage, "catalogPreferencesStorage");
        this.f66437a = getRatingUseCase;
        this.f66438b = appPreferencesStorage;
        this.f66439c = catalogPreferencesStorage;
    }

    /* renamed from: g0 */
    public final boolean mo79665g0(int i) {
        return i >= 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79666h0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$canShowInternalRating$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$canShowInternalRating$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$canShowInternalRating$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$canShowInternalRating$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$canShowInternalRating$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.core.datastore.a r0 = (com.carrefour.fid.android.core.datastore.C36193a) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0063
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0051
        L_0x0040:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r7 = r6.f66438b
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.mo108080c(r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r6
        L_0x0051:
            com.carrefour.fid.android.core.datastore.a r7 = (com.carrefour.fid.android.core.datastore.C36193a) r7
            com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage r2 = r2.f66439c
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = r2.mo130257a(r0)
            if (r0 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0063:
            com.carrefour.fid.android.catalogs.core.datastore.a r7 = (com.carrefour.fid.android.catalogs.core.datastore.C39390a) r7
            int r7 = r7.mo130264d()
            r1 = 0
            if (r7 < r4) goto L_0x006e
            r7 = r4
            goto L_0x006f
        L_0x006e:
            r7 = r1
        L_0x006f:
            int r2 = r0.mo108146y()
            r3 = 5
            if (r2 < r3) goto L_0x0078
            r2 = r4
            goto L_0x0079
        L_0x0078:
            r2 = r1
        L_0x0079:
            if (r7 == 0) goto L_0x0084
            if (r2 == 0) goto L_0x0084
            boolean r7 = r0.mo108119F()
            if (r7 != 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r4 = r1
        L_0x0085:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel.mo79666h0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79667i0(int r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckAppRating$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckAppRating$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckAppRating$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckAppRating$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckAppRating$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel r6 = (com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0081
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005b
        L_0x0048:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r7 = r5.f66438b
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.mo108088k(r0)
            if (r7 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r5
        L_0x005b:
            r7 = -1
            if (r6 == r7) goto L_0x0073
            boolean r6 = r2.mo79665g0(r6)
            if (r6 == 0) goto L_0x0065
            goto L_0x0073
        L_0x0065:
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$c r6 = new com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$c
            com.carrefour.fid.android.core.io.RatingThrowable r7 = new com.carrefour.fid.android.core.io.RatingThrowable
            r7.<init>()
            r6.<init>(r7)
            r2.publishState(r6)
            goto L_0x009f
        L_0x0073:
            com.carrefour.fid.android.domain.interactors.rating.GetRatingUseCase r6 = r2.f66437a
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r6.m173003invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r6 = r2
        L_0x0081:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r7)
            if (r0 != 0) goto L_0x0092
            com.google.android.play.core.review.ReviewInfo r7 = (com.google.android.play.core.review.ReviewInfo) r7
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$a r0 = new com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$a
            r0.<init>(r7)
            r6.publishState(r0)
            goto L_0x009f
        L_0x0092:
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$c r7 = new com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$c
            com.carrefour.fid.android.core.io.RatingThrowable r0 = new com.carrefour.fid.android.core.io.RatingThrowable
            r0.<init>()
            r7.<init>(r0)
            r6.publishState(r7)
        L_0x009f:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel.mo79667i0(int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79668j0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckInternalRating$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckInternalRating$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckInternalRating$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckInternalRating$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$processCheckInternalRating$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.mo79666h0(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0052
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$d r5 = com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel.C27377a.C27381d.f66447c
            r0.publishState(r5)
            goto L_0x005f
        L_0x0052:
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$c r5 = new com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel$a$c
            com.carrefour.fid.android.core.io.RatingThrowable r1 = new com.carrefour.fid.android.core.io.RatingThrowable
            r1.<init>()
            r5.<init>(r1)
            r0.publishState(r5)
        L_0x005f:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel.mo79668j0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: k0 */
    public Object processIntent(@C12579k C27382b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (Intrinsics.areEqual((Object) bVar, (Object) C27382b.C27385c.f66454b)) {
            Object j0 = mo79668j0(cVar);
            if (j0 == C11063b.m42612h()) {
                return j0;
            }
            return C11079d2.f28267a;
        } else if (bVar instanceof C27382b.C27384b) {
            Object i0 = mo79667i0(((C27382b.C27384b) bVar).mo79682a(), cVar);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        } else {
            if (Intrinsics.areEqual((Object) bVar, (Object) C27382b.C27383a.f66450b)) {
                publishState(C27377a.C27379b.f66443c);
            }
            return C11079d2.f28267a;
        }
    }
}
