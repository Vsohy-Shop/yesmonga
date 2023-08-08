package com.usabilla.sdk.ubform;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.C0344h1;
import androidx.appcompat.widget.C0696c;
import androidx.fragment.app.FragmentManager;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.squareup.moshi.C35410s;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.net.C9853d;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.p007db.telemetry.C9783a;
import com.usabilla.sdk.ubform.p008di.C9818a;
import com.usabilla.sdk.ubform.p008di.C9820c;
import com.usabilla.sdk.ubform.p008di.C9823f;
import com.usabilla.sdk.ubform.p008di.UsabillaDIKt;
import com.usabilla.sdk.ubform.p008di.UsabillaDIKt$createCampaignFormModule$1;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.sdk.featurebilla.C9950a;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.model.UsabillaTheme;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormManager;
import com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager;
import com.usabilla.sdk.ubform.sdk.telemetry.C10091a;
import com.usabilla.sdk.ubform.telemetry.C10094a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.TelemetryOption;
import com.usabilla.sdk.ubform.utils.C10117c;
import com.usabilla.sdk.ubform.utils.C10118d;
import com.usabilla.sdk.ubform.utils.C10140g;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002\u0001\b\u0000\u0018\u0000 i2\u00020\u0001:\u00014B\u001b\b\u0002\u0012\u0006\u00109\u001a\u000203\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0006\b¨\u0001\u0010©\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J.\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0016J.\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J \u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020#H\u0016J\u001a\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010(\u001a\u00020\bH\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010.\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010-\u001a\u00020,H\u0016J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b1\u00102R\"\u00109\u001a\u0002038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<RB\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020?0>2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020?0>8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010O\u001a\u0004\u0018\u00010H8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010U\u001a\u00020)8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bP\u0010R\"\u0004\bS\u0010TR.\u0010\u0015\u001a\u0004\u0018\u00010V2\b\u0010@\u001a\u0004\u0018\u00010V8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bK\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R*\u0010^\u001a\u00020)2\u0006\u0010@\u001a\u00020)8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010Q\u001a\u0004\b\\\u0010R\"\u0004\b]\u0010TR*\u0010a\u001a\u00020)2\u0006\u0010@\u001a\u00020)8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b&\u0010Q\u001a\u0004\b_\u0010R\"\u0004\b`\u0010TR\u001a\u0010f\u001a\u00020b8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010c\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020\u00068VX\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001b\u0010o\u001a\u00020l8VX\u0002¢\u0006\f\n\u0004\b \u0010h\u001a\u0004\bm\u0010nR\u001b\u0010s\u001a\u00020p8BX\u0002¢\u0006\f\n\u0004\b(\u0010h\u001a\u0004\bq\u0010rR\u001b\u0010w\u001a\u00020t8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\bu\u0010vR\u001b\u0010{\u001a\u00020x8BX\u0002¢\u0006\f\n\u0004\bS\u0010h\u001a\u0004\by\u0010zR\u001b\u0010\u001a\u00020|8BX\u0002¢\u0006\f\n\u0004\bd\u0010h\u001a\u0004\b}\u0010~R!\u0010\u0001\u001a\u0005\u0018\u00010\u00018BX\u0002¢\u0006\u000e\n\u0004\b*\u0010h\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000e\n\u0004\b`\u0010h\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000e\n\u0004\b.\u0010h\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000e\n\u0004\bX\u0010h\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bM\u0010\u0001R\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0001R(\u0010\u0001\u001a\u0004\u0018\u00010/8\u0016@\u0016X\u000e¢\u0006\u0015\n\u0005\b'\u0010\u0001\u001a\u0005\bA\u0010\u0001\"\u0005\b\u0001\u00102R\u001f\u0010\u0001\u001a\u00030\u00018@X\u0002¢\u0006\u000e\n\u0004\b_\u0010h\u001a\u0006\b\u0001\u0010\u0001R(\u0010¢\u0001\u001a\u0005\u0018\u00010\u00018@X\u0002¢\u0006\u0015\n\u0004\b]\u0010h\u0012\u0006\b \u0001\u0010¡\u0001\u001a\u0005\bQ\u0010\u0001R\u001f\u0010¦\u0001\u001a\u00030£\u00018@X\u0002¢\u0006\u000e\n\u0004\b$\u0010h\u001a\u0006\b¤\u0001\u0010¥\u0001R%\u0010§\u0001\u001a\u00020)2\u0006\u0010@\u001a\u00020)8V@VX\u000e¢\u0006\f\u001a\u0004\bg\u0010R\"\u0004\bI\u0010T¨\u0006ª\u0001"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/UsabillaInternal;", "Lcom/usabilla/sdk/ubform/f;", "Landroid/content/Context;", "context", "", "appId", "Lcom/usabilla/sdk/ubform/net/http/g;", "client", "Lkotlin/d2;", "k0", "m0", "Landroid/app/Activity;", "activity", "Landroid/graphics/Bitmap;", "i", "Landroid/view/View;", "view", "D", "formId", "screenshot", "Lcom/usabilla/sdk/ubform/sdk/form/model/UsabillaTheme;", "theme", "Lcom/usabilla/sdk/ubform/e;", "callback", "u", "", "formIds", "m", "Lcom/usabilla/sdk/ubform/g;", "g", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "k", "event", "Lkotlinx/coroutines/flow/e;", "Lcom/usabilla/sdk/ubform/eventengine/EventResult;", "y", "eventResult", "h", "v", "l", "", "p", "masks", "", "maskCharacter", "r", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "model", "X", "(Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;)V", "Lcom/usabilla/sdk/ubform/di/a;", "a", "Lcom/usabilla/sdk/ubform/di/a;", "()Lcom/usabilla/sdk/ubform/di/a;", "l0", "(Lcom/usabilla/sdk/ubform/di/a;)V", "component", "Lcom/usabilla/sdk/ubform/utils/d;", "b", "Lcom/usabilla/sdk/ubform/utils/d;", "dispatchers", "Ljava/util/concurrent/ConcurrentMap;", "", "value", "c", "Ljava/util/concurrent/ConcurrentMap;", "F", "()Ljava/util/concurrent/ConcurrentMap;", "B", "(Ljava/util/concurrent/ConcurrentMap;)V", "customVariables", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "d", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "f", "()Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "t", "(Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;)V", "bannerConfiguration", "e", "Z", "()Z", "n", "(Z)V", "submitTelemetryData", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "s", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "setTheme", "(Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;)V", "E", "x", "navigationButtonsVisibility", "w", "q", "footerLogoClickability", "Lcom/usabilla/sdk/ubform/utils/g;", "Lcom/usabilla/sdk/ubform/utils/g;", "o", "()Lcom/usabilla/sdk/ubform/utils/g;", "payloadGenerator", "j", "Lcom/usabilla/sdk/ubform/di/c;", "z", "()Lcom/usabilla/sdk/ubform/net/http/g;", "httpClient", "Lcom/usabilla/sdk/ubform/net/d;", "A", "()Lcom/usabilla/sdk/ubform/net/d;", "requestBuilder", "Lcom/usabilla/sdk/ubform/db/telemetry/a;", "i0", "()Lcom/usabilla/sdk/ubform/db/telemetry/a;", "telemetryDao", "Lcom/usabilla/sdk/ubform/AppInfo;", "Y", "()Lcom/usabilla/sdk/ubform/AppInfo;", "appInfo", "Lcom/usabilla/sdk/ubform/PlayStoreInfo;", "f0", "()Lcom/usabilla/sdk/ubform/PlayStoreInfo;", "playStoreInfo", "Lcom/usabilla/sdk/ubform/telemetry/a;", "h0", "()Lcom/usabilla/sdk/ubform/telemetry/a;", "telemetryClient", "Lcom/usabilla/sdk/ubform/sdk/featurebilla/a;", "b0", "()Lcom/usabilla/sdk/ubform/sdk/featurebilla/a;", "featureFlagManager", "Lkotlinx/coroutines/o0;", "g0", "()Lkotlinx/coroutines/o0;", "scope", "Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveResubmissionManager;", "e0", "()Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveResubmissionManager;", "passiveResubmissionManager", "Lcom/squareup/moshi/s;", "c0", "()Lcom/squareup/moshi/s;", "moshi", "Landroid/content/IntentFilter;", "Landroid/content/IntentFilter;", "formCloseIntentFilter", "com/usabilla/sdk/ubform/UsabillaInternal$b", "Lcom/usabilla/sdk/ubform/UsabillaInternal$b;", "formClosedReceiver", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "()Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "C", "formModel", "Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveFormManager;", "d0", "()Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveFormManager;", "passiveFormManager", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignManager;", "()Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignManager;", "getCampaignManager$ubform_sdkRelease$annotations", "()V", "campaignManager", "Lcom/usabilla/sdk/ubform/sdk/telemetry/a;", "j0", "()Lcom/usabilla/sdk/ubform/sdk/telemetry/a;", "telemetryManager", "debugEnabled", "<init>", "(Lcom/usabilla/sdk/ubform/di/a;Lcom/usabilla/sdk/ubform/utils/d;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UsabillaInternal implements C9847f {

    /* renamed from: A */
    public static final /* synthetic */ C11510n<Object>[] f26659A;
    @C12580l

    /* renamed from: B */
    public static UsabillaInternal f26660B;
    @C12579k

    /* renamed from: z */
    public static final C9721a f26661z = new C9721a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public C9818a f26662a;
    @C12579k

    /* renamed from: b */
    public final C10118d f26663b;
    @C12579k

    /* renamed from: c */
    public ConcurrentMap<String, Object> f26664c;
    @C12580l

    /* renamed from: d */
    public BannerConfiguration f26665d;

    /* renamed from: e */
    public boolean f26666e;
    @C12580l

    /* renamed from: f */
    public UbInternalTheme f26667f;

    /* renamed from: g */
    public boolean f26668g;

    /* renamed from: h */
    public boolean f26669h;
    @C12579k

    /* renamed from: i */
    public final C10140g f26670i;
    @C12579k

    /* renamed from: j */
    public final C9820c f26671j;
    @C12579k

    /* renamed from: k */
    public final C9820c f26672k;
    @C12579k

    /* renamed from: l */
    public final C9820c f26673l;
    @C12579k

    /* renamed from: m */
    public final C9820c f26674m;
    @C12579k

    /* renamed from: n */
    public final C9820c f26675n;
    @C12579k

    /* renamed from: o */
    public final C9820c f26676o;
    @C12579k

    /* renamed from: p */
    public final C9820c f26677p;
    @C12579k

    /* renamed from: q */
    public final C9820c f26678q;
    @C12579k

    /* renamed from: r */
    public final C9820c f26679r;
    @C12579k

    /* renamed from: s */
    public final C9820c f26680s;
    @C12579k

    /* renamed from: t */
    public final IntentFilter f26681t;
    @C12579k

    /* renamed from: u */
    public final C9722b f26682u;
    @C12580l

    /* renamed from: v */
    public FormModel f26683v;
    @C12579k

    /* renamed from: w */
    public final C9820c f26684w;
    @C12579k

    /* renamed from: x */
    public final C9820c f26685x;
    @C12579k

    /* renamed from: y */
    public final C9820c f26686y;

    /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$a */
    public static final class C9721a {
        public /* synthetic */ C9721a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C9847f m36482b(C9721a aVar, C9818a aVar2, C10118d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = null;
            }
            if ((i & 2) != 0) {
                dVar = new C10117c();
            }
            return aVar.mo19883a(aVar2, dVar);
        }

        @C12579k
        /* renamed from: a */
        public final C9847f mo19883a(@C12580l C9818a aVar, @C12579k C10118d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "dispatchers");
            if (UsabillaInternal.f26660B == null) {
                if (aVar == null) {
                    aVar = new C9818a(C10976s.m41419k(Intrinsics.checkNotNullParameter(dVar, "dispatchers")), (C9818a) null, 2, (DefaultConstructorMarker) null);
                }
                UsabillaInternal.f26660B = new UsabillaInternal(aVar, dVar, (DefaultConstructorMarker) null);
            }
            UsabillaInternal K = UsabillaInternal.f26660B;
            Intrinsics.checkNotNull(K);
            return K;
        }

        public C9721a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$b */
    public static final class C9722b extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ UsabillaInternal f26687a;

        public C9722b(UsabillaInternal usabillaInternal) {
            this.f26687a = usabillaInternal;
        }

        public void onReceive(@C12580l Context context, @C12580l Intent intent) {
            String action;
            if (!(intent == null || (action = intent.getAction()) == null)) {
                UsabillaInternal usabillaInternal = this.f26687a;
                if (Intrinsics.areEqual((Object) action, (Object) C9771d.f26774b)) {
                    usabillaInternal.mo19838C((FormModel) null);
                }
            }
            UsabillaInternal usabillaInternal2 = this.f26687a;
            usabillaInternal2.mo19868m0(usabillaInternal2.mo19843Y().mo19774t());
        }
    }

    static {
        Class<UsabillaInternal> cls = UsabillaInternal.class;
        f26659A = new C11510n[]{C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), C10108c.f27785J, "getHttpClient()Lcom/usabilla/sdk/ubform/net/http/UsabillaHttpClient;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "requestBuilder", "getRequestBuilder()Lcom/usabilla/sdk/ubform/net/RequestBuilder;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "telemetryDao", "getTelemetryDao()Lcom/usabilla/sdk/ubform/db/telemetry/TelemetryDao;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "appInfo", "getAppInfo()Lcom/usabilla/sdk/ubform/AppInfo;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "playStoreInfo", "getPlayStoreInfo()Lcom/usabilla/sdk/ubform/PlayStoreInfo;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "telemetryClient", "getTelemetryClient()Lcom/usabilla/sdk/ubform/telemetry/TelemetryClient;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "featureFlagManager", "getFeatureFlagManager()Lcom/usabilla/sdk/ubform/sdk/featurebilla/FeaturebillaManager;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "scope", "getScope()Lkotlinx/coroutines/CoroutineScope;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "passiveResubmissionManager", "getPassiveResubmissionManager()Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveResubmissionManager;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "moshi", "getMoshi()Lcom/squareup/moshi/Moshi;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "passiveFormManager", "getPassiveFormManager$ubform_sdkRelease()Lcom/usabilla/sdk/ubform/sdk/passiveForm/PassiveFormManager;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "campaignManager", "getCampaignManager$ubform_sdkRelease()Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignManager;")), C11342l0.m43564u(new PropertyReference1Impl(C11342l0.m43547d(cls), "telemetryManager", "getTelemetryManager$ubform_sdkRelease()Lcom/usabilla/sdk/ubform/sdk/telemetry/TelemetryManager;"))};
    }

    public /* synthetic */ UsabillaInternal(C9818a aVar, C10118d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, dVar);
    }

    @C0344h1(otherwise = 2)
    /* renamed from: a0 */
    public static /* synthetic */ void m36434a0() {
    }

    @C12579k
    /* renamed from: A */
    public C9853d mo19836A() {
        return (C9853d) this.f26672k.mo20113a(this, f26659A[1]);
    }

    /* renamed from: B */
    public void mo19837B(@C12579k ConcurrentMap<String, Object> concurrentMap) {
        Intrinsics.checkNotNullParameter(concurrentMap, "value");
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.PROPERTY, new UsabillaInternal$customVariables$1(concurrentMap, this));
    }

    /* renamed from: C */
    public void mo19838C(@C12580l FormModel formModel) {
        this.f26683v = formModel;
    }

    @C12580l
    /* renamed from: D */
    public Bitmap mo19839D(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        return (Bitmap) C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.METHOD, new UsabillaInternal$takeScreenshot$2(view));
    }

    /* renamed from: E */
    public boolean mo19840E() {
        return this.f26668g;
    }

    @C12579k
    /* renamed from: F */
    public ConcurrentMap<String, Object> mo19841F() {
        return this.f26664c;
    }

    @C0344h1
    /* renamed from: X */
    public final void mo19842X(@C12579k FormModel formModel) {
        Intrinsics.checkNotNullParameter(formModel, C40045d.f102104u);
        CampaignManager Z = mo19844Z();
        Intrinsics.checkNotNull(Z);
        CampaignManager.m37440f(Z, formModel, "fake campaign ID", (BannerConfiguration) null, 4, (Object) null);
    }

    /* renamed from: Y */
    public final AppInfo mo19843Y() {
        return (AppInfo) this.f26674m.mo20113a(this, f26659A[3]);
    }

    @C12580l
    /* renamed from: Z */
    public final CampaignManager mo19844Z() {
        return (CampaignManager) this.f26685x.mo20113a(this, f26659A[11]);
    }

    @C12579k
    /* renamed from: a */
    public C9818a mo19845a() {
        return this.f26662a;
    }

    /* renamed from: b0 */
    public final C9950a mo19846b0() {
        return (C9950a) this.f26677p.mo20113a(this, f26659A[6]);
    }

    @C12580l
    /* renamed from: c */
    public FormModel mo19847c() {
        return this.f26683v;
    }

    /* renamed from: c0 */
    public final C35410s mo19848c0() {
        return (C35410s) this.f26680s.mo20113a(this, f26659A[9]);
    }

    /* renamed from: d */
    public void mo19849d(boolean z) {
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.PROPERTY, new UsabillaInternal$debugEnabled$1(z));
    }

    @C12579k
    /* renamed from: d0 */
    public final PassiveFormManager mo19850d0() {
        return (PassiveFormManager) this.f26684w.mo20113a(this, f26659A[10]);
    }

    /* renamed from: e */
    public boolean mo19851e() {
        return this.f26666e;
    }

    /* renamed from: e0 */
    public final PassiveResubmissionManager mo19852e0() {
        return (PassiveResubmissionManager) this.f26679r.mo20113a(this, f26659A[8]);
    }

    @C12580l
    /* renamed from: f */
    public BannerConfiguration mo19853f() {
        return this.f26665d;
    }

    /* renamed from: f0 */
    public final PlayStoreInfo mo19854f0() {
        return (PlayStoreInfo) this.f26675n.mo20113a(this, f26659A[4]);
    }

    /* renamed from: g */
    public void mo19855g(@C12579k Context context, @C12580l String str, @C12580l C9870g gVar, @C12580l C9848g gVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$initialize$1(str, gVar, gVar2, this, context));
    }

    /* renamed from: g0 */
    public final C12074o0 mo19856g0() {
        return (C12074o0) this.f26678q.mo20113a(this, f26659A[7]);
    }

    /* renamed from: h */
    public void mo19857h(@C12579k EventResult eventResult) {
        Intrinsics.checkNotNullParameter(eventResult, "eventResult");
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$showCampaign$1(eventResult, this));
    }

    /* renamed from: h0 */
    public final C10094a mo19858h0() {
        return (C10094a) this.f26676o.mo20113a(this, f26659A[5]);
    }

    @C12580l
    /* renamed from: i */
    public Bitmap mo19859i(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        return (Bitmap) C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.METHOD, new UsabillaInternal$takeScreenshot$1(activity));
    }

    /* renamed from: i0 */
    public final C9783a mo19860i0() {
        return (C9783a) this.f26673l.mo20113a(this, f26659A[2]);
    }

    /* renamed from: j */
    public boolean mo19861j() {
        return Logger.f26647a.isDebugEnabled();
    }

    @C12579k
    /* renamed from: j0 */
    public final C10091a mo19862j0() {
        return (C10091a) this.f26686y.mo20113a(this, f26659A[12]);
    }

    /* renamed from: k */
    public void mo19863k(@C12579k FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$updateFragmentManager$1(this, fragmentManager));
    }

    /* renamed from: k0 */
    public final void mo19864k0(Context context, String str, C9870g gVar) {
        List P = CollectionsKt__CollectionsKt.m40452P(Intrinsics.checkNotNullParameter(context, C9175a.f24932Y), UsabillaDIKt.m36694g(context, str, gVar, (PlayStoreInfo) null, 8, (Object) null), Intrinsics.checkNotNullParameter(context, C9175a.f24932Y), Intrinsics.checkNotNullParameter(context, C9175a.f24932Y));
        if (str != null) {
            try {
                UUID.fromString(str);
                P.add(C9823f.m36768a(UsabillaDIKt$createCampaignFormModule$1.f26849f));
            } catch (IllegalArgumentException unused) {
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
        mo19866l0(new C9818a(P, mo19845a()));
    }

    /* renamed from: l */
    public void mo19865l() {
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$removeCachedForms$1(this));
    }

    /* renamed from: l0 */
    public void mo19866l0(@C12579k C9818a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f26662a = aVar;
    }

    /* renamed from: m */
    public void mo19867m(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "formIds");
        for (String usabillaInternal$preloadFeedbackForms$1 : list) {
            C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$preloadFeedbackForms$1(usabillaInternal$preloadFeedbackForms$1, this));
        }
    }

    /* renamed from: m0 */
    public final void mo19868m0(String str) {
        if (str == null) {
            str = mo19843Y().mo19774t();
        }
        if (mo19851e()) {
            C11723c2 unused = C12038j.m48061f(mo19856g0(), (CoroutineContext) null, (CoroutineStart) null, new UsabillaInternal$submitTelemetryData$1(this, str, (C11045c<? super UsabillaInternal$submitTelemetryData$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: n */
    public void mo19869n(boolean z) {
        this.f26666e = z;
    }

    @C12579k
    /* renamed from: o */
    public C10140g mo19870o() {
        return this.f26670i;
    }

    /* renamed from: p */
    public boolean mo19871p(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return ((Boolean) C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.METHOD, new UsabillaInternal$dismiss$1(this, context))).booleanValue();
    }

    /* renamed from: q */
    public void mo19872q(boolean z) {
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.PROPERTY, new UsabillaInternal$footerLogoClickability$1(z, this));
    }

    /* renamed from: r */
    public void mo19873r(@C12579k List<String> list, char c) {
        Intrinsics.checkNotNullParameter(list, C10108c.f27786K);
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.METHOD, new UsabillaInternal$setDataMasking$1(list, c));
    }

    @C12580l
    /* renamed from: s */
    public UbInternalTheme mo19874s() {
        return this.f26667f;
    }

    public void setTheme(@C12580l UbInternalTheme ubInternalTheme) {
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.PROPERTY, new UsabillaInternal$theme$1(this, ubInternalTheme));
    }

    /* renamed from: t */
    public void mo19876t(@C12580l BannerConfiguration bannerConfiguration) {
        this.f26665d = bannerConfiguration;
    }

    /* renamed from: u */
    public void mo19877u(@C12579k String str, @C12580l Bitmap bitmap, @C12580l UsabillaTheme usabillaTheme, @C12580l C9826e eVar) {
        Intrinsics.checkNotNullParameter(str, "formId");
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$loadFeedbackForm$1(str, bitmap, usabillaTheme, eVar, this));
    }

    /* renamed from: v */
    public void mo19878v(@C12579k Context context, @C12580l C9848g gVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$resetCampaignData$1(gVar, this));
    }

    /* renamed from: w */
    public boolean mo19879w() {
        return this.f26669h;
    }

    /* renamed from: x */
    public void mo19880x(boolean z) {
        C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21539a(TelemetryOption.PROPERTY, new UsabillaInternal$navigationButtonsVisibility$1(z, this));
    }

    @C12579k
    /* renamed from: y */
    public C11907e<EventResult> mo19881y(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "event");
        return (C11907e) C10094a.C10095a.m38252a(mo19858h0(), (JSONObject) null, 1, (Object) null).mo21542d(TelemetryOption.METHOD, new UsabillaInternal$sendEvent$1(str, this));
    }

    @C12579k
    /* renamed from: z */
    public C9870g mo19882z() {
        return (C9870g) this.f26671j.mo20113a(this, f26659A[0]);
    }

    public UsabillaInternal(C9818a aVar, C10118d dVar) {
        this.f26662a = aVar;
        this.f26663b = dVar;
        this.f26664c = new ConcurrentHashMap();
        this.f26666e = true;
        this.f26668g = true;
        this.f26669h = true;
        this.f26670i = new C10140g();
        this.f26671j = new C9820c(new UsabillaInternal$special$$inlined$inject$1(this));
        this.f26672k = new C9820c(new UsabillaInternal$special$$inlined$inject$2(this));
        this.f26673l = new C9820c(new UsabillaInternal$special$$inlined$inject$3(this));
        this.f26674m = new C9820c(new UsabillaInternal$special$$inlined$inject$4(this));
        this.f26675n = new C9820c(new UsabillaInternal$special$$inlined$inject$5(this));
        this.f26676o = new C9820c(new UsabillaInternal$special$$inlined$inject$6(this));
        this.f26677p = new C9820c(new UsabillaInternal$special$$inlined$injectNullable$1(this));
        this.f26678q = new C9820c(new UsabillaInternal$special$$inlined$inject$7(this));
        this.f26679r = new C9820c(new UsabillaInternal$special$$inlined$inject$8(this));
        this.f26680s = new C9820c(new UsabillaInternal$special$$inlined$inject$9(this));
        IntentFilter intentFilter = new IntentFilter(C9771d.f26774b);
        intentFilter.addAction(C9771d.f26775c);
        C11079d2 d2Var = C11079d2.f28267a;
        this.f26681t = intentFilter;
        this.f26682u = new C9722b(this);
        this.f26684w = new C9820c(new UsabillaInternal$special$$inlined$inject$10(this));
        this.f26685x = new C9820c(new UsabillaInternal$special$$inlined$injectNullable$2(this));
        this.f26686y = new C9820c(new UsabillaInternal$special$$inlined$inject$11(this));
    }
}
