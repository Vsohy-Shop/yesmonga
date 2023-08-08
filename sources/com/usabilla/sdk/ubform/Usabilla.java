package com.usabilla.sdk.ubform;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.C0696c;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.UsabillaInternal;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.p008di.C9818a;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import com.usabilla.sdk.ubform.sdk.form.model.UbFonts;
import com.usabilla.sdk.ubform.sdk.form.model.UbImages;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.model.UsabillaTheme;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.C10118d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bF\u0010GJ4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J2\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0011H\u0007J\u0014\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013J\u0006\u0010\u0016\u001a\u00020\nJ\u001c\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010'\u001a\u00020\n2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\b\u0002\u0010&\u001a\u00020%H\u0007J\u000e\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\"R.\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R<\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001052\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001058F@FX\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010?\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"8F@FX\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010B\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"8F@FX\u000e¢\u0006\f\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R$\u0010E\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"8F@FX\u000e¢\u0006\f\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>¨\u0006H"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/Usabilla;", "", "Landroid/content/Context;", "context", "", "appId", "Lcom/usabilla/sdk/ubform/net/http/g;", "client", "Lcom/usabilla/sdk/ubform/g;", "callback", "Lkotlin/d2;", "initialize", "formId", "Landroid/graphics/Bitmap;", "screenshot", "Lcom/usabilla/sdk/ubform/sdk/form/model/UsabillaTheme;", "theme", "Lcom/usabilla/sdk/ubform/e;", "loadFeedbackForm", "", "formIds", "preloadFeedbackForms", "removeCachedForms", "resetCampaignData", "event", "sendEvent", "Landroid/app/Activity;", "activity", "takeScreenshot", "Landroid/view/View;", "view", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "updateFragmentManager", "", "dismiss", "masks", "", "maskCharacter", "setDataMasking", "clickable", "setFooterLogoClickable", "value", "b", "Lcom/usabilla/sdk/ubform/sdk/form/model/UsabillaTheme;", "getTheme", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UsabillaTheme;", "setTheme", "(Lcom/usabilla/sdk/ubform/sdk/form/model/UsabillaTheme;)V", "Lcom/usabilla/sdk/ubform/f;", "c", "Lcom/usabilla/sdk/ubform/f;", "usabillaInternal", "", "getCustomVariables", "()Ljava/util/Map;", "setCustomVariables", "(Ljava/util/Map;)V", "customVariables", "getDebugEnabled", "()Z", "setDebugEnabled", "(Z)V", "debugEnabled", "getDefaultNavigationButtonsVisibility", "setDefaultNavigationButtonsVisibility", "defaultNavigationButtonsVisibility", "getSubmitTelemetryData", "setSubmitTelemetryData", "submitTelemetryData", "<init>", "()V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class Usabilla {
    @C12579k

    /* renamed from: a */
    public static final Usabilla f26653a = new Usabilla();
    @C12580l

    /* renamed from: b */
    public static UsabillaTheme f26654b;
    @C12579k

    /* renamed from: c */
    public static final C9847f f26655c = UsabillaInternal.C9721a.m36482b(UsabillaInternal.f26661z, (C9818a) null, (C10118d) null, 3, (Object) null);

    public static /* synthetic */ void initialize$default(Usabilla usabilla, Context context, String str, C9870g gVar, C9848g gVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        if ((i & 8) != 0) {
            gVar2 = null;
        }
        usabilla.initialize(context, str, gVar, gVar2);
    }

    public static /* synthetic */ void loadFeedbackForm$default(Usabilla usabilla, String str, Bitmap bitmap, UsabillaTheme usabillaTheme, C9826e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bitmap = null;
        }
        if ((i & 4) != 0) {
            usabillaTheme = null;
        }
        usabilla.loadFeedbackForm(str, bitmap, usabillaTheme, eVar);
    }

    public static /* synthetic */ void resetCampaignData$default(Usabilla usabilla, Context context, C9848g gVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        usabilla.resetCampaignData(context, gVar);
    }

    public static /* synthetic */ void setDataMasking$default(Usabilla usabilla, List<String> list, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            list = C9771d.m36567a();
        }
        if ((i & 2) != 0) {
            c = C9771d.m36569c();
        }
        usabilla.setDataMasking(list, c);
    }

    public final boolean dismiss(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return f26655c.mo19871p(context);
    }

    @C12579k
    public final Map<String, Object> getCustomVariables() {
        return f26655c.mo19841F();
    }

    public final boolean getDebugEnabled() {
        return f26655c.mo19861j();
    }

    public final boolean getDefaultNavigationButtonsVisibility() {
        return f26655c.mo19840E();
    }

    public final boolean getSubmitTelemetryData() {
        return f26655c.mo19851e();
    }

    @C12580l
    public final UsabillaTheme getTheme() {
        return f26654b;
    }

    @C11315i
    public final void initialize(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        initialize$default(this, context, (String) null, (C9870g) null, (C9848g) null, 14, (Object) null);
    }

    @C11315i
    public final void loadFeedbackForm(@C12579k String str, @C12580l Bitmap bitmap, @C12580l C9826e eVar) {
        Intrinsics.checkNotNullParameter(str, "formId");
        loadFeedbackForm$default(this, str, bitmap, (UsabillaTheme) null, eVar, 4, (Object) null);
    }

    public final void preloadFeedbackForms(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "formIds");
        f26655c.mo19867m(list);
    }

    public final void removeCachedForms() {
        f26655c.mo19865l();
    }

    @C11315i
    public final void resetCampaignData(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        resetCampaignData$default(this, context, (C9848g) null, 2, (Object) null);
    }

    public final void sendEvent(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "event");
        C11723c2 unused = C12038j.m48061f((C12074o0) f26655c.mo19845a().mo20109c(C12074o0.class), (CoroutineContext) null, (CoroutineStart) null, new Usabilla$sendEvent$1(context, str, (C11045c<? super Usabilla$sendEvent$1>) null), 3, (Object) null);
    }

    public final void setCustomVariables(@C12579k Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "value");
        f26655c.mo19837B(new ConcurrentHashMap(map));
    }

    @C11315i
    public final void setDataMasking() {
        setDataMasking$default(this, (List) null, 0, 3, (Object) null);
    }

    public final void setDebugEnabled(boolean z) {
        f26655c.mo19849d(z);
    }

    public final void setDefaultNavigationButtonsVisibility(boolean z) {
        f26655c.mo19880x(z);
    }

    public final void setFooterLogoClickable(boolean z) {
        f26655c.mo19872q(z);
    }

    public final void setSubmitTelemetryData(boolean z) {
        f26655c.mo19869n(z);
    }

    public final void setTheme(@C12580l UsabillaTheme usabillaTheme) {
        C11079d2 d2Var;
        if (usabillaTheme == null) {
            d2Var = null;
        } else {
            C9847f fVar = f26655c;
            UbInternalTheme s = fVar.mo19874s();
            if (s == null) {
                s = new UbInternalTheme((UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, (UbFonts) null, (UbImages) null, false, 63, (DefaultConstructorMarker) null);
            }
            UbInternalTheme ubInternalTheme = s;
            UbFonts fonts = usabillaTheme.getFonts();
            if (fonts != null) {
                ubInternalTheme = UbInternalTheme.copy$default(ubInternalTheme, (UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, fonts, (UbImages) null, false, 55, (Object) null);
            }
            UbInternalTheme ubInternalTheme2 = ubInternalTheme;
            UbImages images = usabillaTheme.getImages();
            if (images != null) {
                ubInternalTheme2 = UbInternalTheme.copy$default(ubInternalTheme2, (UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, (UbFonts) null, images, false, 47, (Object) null);
            }
            fVar.setTheme(ubInternalTheme2);
            d2Var = C11079d2.f28267a;
        }
        if (d2Var == null) {
            f26655c.setTheme((UbInternalTheme) null);
        }
        f26654b = usabillaTheme;
    }

    @C12580l
    public final Bitmap takeScreenshot(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        return f26655c.mo19859i(activity);
    }

    public final void updateFragmentManager(@C12579k FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        f26655c.mo19863k(fragmentManager);
    }

    @C11315i
    public final void initialize(@C12579k Context context, @C12580l String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        initialize$default(this, context, str, (C9870g) null, (C9848g) null, 12, (Object) null);
    }

    @C11315i
    public final void loadFeedbackForm(@C12579k String str, @C12580l C9826e eVar) {
        Intrinsics.checkNotNullParameter(str, "formId");
        loadFeedbackForm$default(this, str, (Bitmap) null, (UsabillaTheme) null, eVar, 6, (Object) null);
    }

    @C11315i
    public final void resetCampaignData(@C12579k Context context, @C12580l C9848g gVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        f26655c.mo19878v(context, gVar);
    }

    @C11315i
    public final void setDataMasking(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, C10108c.f27786K);
        setDataMasking$default(this, list, 0, 2, (Object) null);
    }

    @C12580l
    public final Bitmap takeScreenshot(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        return f26655c.mo19839D(view);
    }

    @C11315i
    public final void initialize(@C12579k Context context, @C12580l String str, @C12580l C9870g gVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        initialize$default(this, context, str, gVar, (C9848g) null, 8, (Object) null);
    }

    @C11315i
    public final void loadFeedbackForm(@C12579k String str, @C12580l Bitmap bitmap, @C12580l UsabillaTheme usabillaTheme, @C12580l C9826e eVar) {
        Intrinsics.checkNotNullParameter(str, "formId");
        f26655c.mo19877u(str, bitmap, usabillaTheme, eVar);
    }

    @C11315i
    public final void setDataMasking(@C12579k List<String> list, char c) {
        Intrinsics.checkNotNullParameter(list, C10108c.f27786K);
        f26655c.mo19873r(list, c);
    }

    @C11315i
    public final void initialize(@C12579k Context context, @C12580l String str, @C12580l C9870g gVar, @C12580l C9848g gVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C9847f fVar = f26655c;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        fVar.mo19855g(applicationContext, str, gVar, gVar2);
    }
}
