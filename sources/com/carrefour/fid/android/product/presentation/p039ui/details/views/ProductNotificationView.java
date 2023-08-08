package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27497k0;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.urbanairship.iam.events.C9175a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 $2\u00020\u0001:\u0003\u0016\u001a%B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ.\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0002J*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/views/ProductNotificationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/d2;", "onDetachedFromWindow", "Lcom/carrefour/fid/android/domain/models/offer/Offer;", "offer", "", "F", "", "messageResId", "G", "titleResId", "Lkotlin/Function0;", "dismissAction", "y", "", "title", "message", "z", "D", "H", "Lcom/carrefour/fid/android/product/databinding/k0;", "a", "Lcom/carrefour/fid/android/product/databinding/k0;", "binding", "Ljava/util/Timer;", "b", "Ljava/util/Timer;", "timer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "OfferNotificationType", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView */
public final class ProductNotificationView extends ConstraintLayout {
    @C12579k

    /* renamed from: c */
    public static final C27922a f67721c = new C27922a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final long f67722d = 5000;

    /* renamed from: e */
    public static final long f67723e = 200;
    @C12579k

    /* renamed from: f */
    public static final C27923b f67724f = new C27923b(5000);
    @C12579k

    /* renamed from: a */
    public final C27497k0 f67725a;
    @C12580l

    /* renamed from: b */
    public Timer f67726b;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/views/ProductNotificationView$OfferNotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView$OfferNotificationType */
    public enum OfferNotificationType {
        PROMO_MIXED
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView$a */
    public static final class C27922a {
        public /* synthetic */ C27922a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27922a() {
        }
    }

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nProductNotificationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductNotificationView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductNotificationView$OfferNotificationMap\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,175:1\n483#2,7:176\n1#3:183\n215#4,2:184\n*S KotlinDebug\n*F\n+ 1 ProductNotificationView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductNotificationView$OfferNotificationMap\n*L\n155#1:176,7\n169#1:184,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView$b */
    public static final class C27923b {

        /* renamed from: c */
        public static final int f67729c = 8;

        /* renamed from: a */
        public final long f67730a;
        @C12579k

        /* renamed from: b */
        public final Map<OfferNotificationType, Pair<String, Long>> f67731b = new LinkedHashMap();

        public C27923b(long j) {
            this.f67730a = j;
        }

        /* renamed from: a */
        public final long mo81301a(@C12580l OfferNotificationType offerNotificationType, @C12579k String str) {
            Pair pair;
            Intrinsics.checkNotNullParameter(str, "ean");
            if (offerNotificationType == null) {
                return 0;
            }
            if (this.f67731b.containsKey(offerNotificationType)) {
                Map<OfferNotificationType, Pair<String, Long>> map = this.f67731b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry next : map.entrySet()) {
                    if (Intrinsics.areEqual(((Pair) next.getValue()).mo21849e(), (Object) str)) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.m40721z2(linkedHashMap.entrySet());
                if (entry == null || (pair = (Pair) entry.getValue()) == null) {
                    return 0;
                }
                return Long.max(0, this.f67730a - (System.currentTimeMillis() - ((Number) pair.mo21851f()).longValue()));
            }
            this.f67731b.put(offerNotificationType, new Pair(str, Long.valueOf(System.currentTimeMillis())));
            return this.f67730a;
        }

        /* renamed from: b */
        public final void mo81302b() {
            for (Map.Entry next : this.f67731b.entrySet()) {
                this.f67731b.put((OfferNotificationType) next.getKey(), new Pair(((Pair) next.getValue()).mo21849e(), -1L));
            }
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 ProductNotificationView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductNotificationView\n*L\n1#1,148:1\n81#2:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView$c */
    public static final class C27924c extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ ProductNotificationView f67732a;

        public C27924c(ProductNotificationView productNotificationView) {
            this.f67732a = productNotificationView;
        }

        public void run() {
            boolean unused = this.f67732a.mo81294D();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductNotificationView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static /* synthetic */ void m117236A(ProductNotificationView productNotificationView, int i, int i2, C11289a aVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            aVar = null;
        }
        productNotificationView.mo81299y(i, i2, aVar);
    }

    /* renamed from: B */
    public static /* synthetic */ void m117237B(ProductNotificationView productNotificationView, String str, String str2, C11289a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        productNotificationView.mo81300z(str, str2, aVar);
    }

    /* renamed from: C */
    public static final void m117238C(ProductNotificationView productNotificationView, C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(productNotificationView, "this$0");
        Timer timer = productNotificationView.f67726b;
        if (timer != null) {
            timer.cancel();
        }
        if (aVar != null) {
            aVar.invoke();
        } else {
            productNotificationView.mo81294D();
        }
        f67724f.mo81302b();
    }

    /* renamed from: E */
    public static final void m117239E(ProductNotificationView productNotificationView) {
        Intrinsics.checkNotNullParameter(productNotificationView, "this$0");
        ViewKt.m152126h(productNotificationView, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
    }

    /* renamed from: D */
    public final boolean mo81294D() {
        return post(new C27932g(this));
    }

    /* renamed from: F */
    public final boolean mo81295F(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        clearAnimation();
        long a = f67724f.mo81301a(OfferNotificationType.PROMO_MIXED, offer.mo118010S().mo118415P());
        if (a <= 200) {
            setVisibility(8);
            return false;
        }
        m117236A(this, C27609f.C27627r.basket_notify_promo_mixed_title, C27609f.C27627r.basket_notify_promo_mixed_message, (C11289a) null, 4, (Object) null);
        if (a == 5000) {
            mo81297H();
            return true;
        }
        setVisibility(0);
        Timer timer = new Timer();
        timer.schedule(new C27924c(this), a);
        this.f67726b = timer;
        return false;
    }

    /* renamed from: G */
    public final boolean mo81296G(@C0324b1 int i) {
        clearAnimation();
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(messageResId)");
        m117237B(this, "", string, (C11289a) null, 4, (Object) null);
        mo81297H();
        return true;
    }

    /* renamed from: H */
    public final void mo81297H() {
        ViewKt.m152123e(this, (Integer) null, false, new ProductNotificationView$show$1(this), 3, (Object) null);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Timer timer = this.f67726b;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* renamed from: y */
    public final void mo81299y(@C0324b1 int i, @C0324b1 int i2, C11289a<C11079d2> aVar) {
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(titleResId)");
        String string2 = getContext().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(messageResId)");
        mo81300z(string, string2, aVar);
    }

    /* renamed from: z */
    public final void mo81300z(String str, String str2, C11289a<C11079d2> aVar) {
        this.f67725a.f66709b.setOnClickListener(new C27931f(this, aVar));
        TextView textView = this.f67725a.f66711d;
        textView.setText(str);
        if (C11622t.isBlank(str)) {
            textView.setVisibility(8);
        }
        this.f67725a.f66710c.setText(str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductNotificationView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductNotificationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductNotificationView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C27497k0 d = C27497k0.m115711d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f67725a = d;
        setVisibility(8);
    }
}
