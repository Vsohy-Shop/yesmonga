package com.usabilla.sdk.ubform;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.net.C9853d;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.p008di.C9819b;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.model.UsabillaTheme;
import com.usabilla.sdk.ubform.utils.C10140g;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.f */
public interface C9847f extends C9819b {
    @C12579k
    /* renamed from: A */
    C9853d mo19836A();

    /* renamed from: B */
    void mo19837B(@C12579k ConcurrentMap<String, Object> concurrentMap);

    /* renamed from: C */
    void mo19838C(@C12580l FormModel formModel);

    @C12580l
    /* renamed from: D */
    Bitmap mo19839D(@C12579k View view);

    /* renamed from: E */
    boolean mo19840E();

    @C12579k
    /* renamed from: F */
    ConcurrentMap<String, Object> mo19841F();

    @C12580l
    /* renamed from: c */
    FormModel mo19847c();

    /* renamed from: d */
    void mo19849d(boolean z);

    /* renamed from: e */
    boolean mo19851e();

    @C12580l
    /* renamed from: f */
    BannerConfiguration mo19853f();

    /* renamed from: g */
    void mo19855g(@C12579k Context context, @C12580l String str, @C12580l C9870g gVar, @C12580l C9848g gVar2);

    /* renamed from: h */
    void mo19857h(@C12579k EventResult eventResult);

    @C12580l
    /* renamed from: i */
    Bitmap mo19859i(@C12579k Activity activity);

    /* renamed from: j */
    boolean mo19861j();

    /* renamed from: k */
    void mo19863k(@C12579k FragmentManager fragmentManager);

    /* renamed from: l */
    void mo19865l();

    /* renamed from: m */
    void mo19867m(@C12579k List<String> list);

    /* renamed from: n */
    void mo19869n(boolean z);

    @C12579k
    /* renamed from: o */
    C10140g mo19870o();

    /* renamed from: p */
    boolean mo19871p(@C12579k Context context);

    /* renamed from: q */
    void mo19872q(boolean z);

    /* renamed from: r */
    void mo19873r(@C12579k List<String> list, char c);

    @C12580l
    /* renamed from: s */
    UbInternalTheme mo19874s();

    void setTheme(@C12580l UbInternalTheme ubInternalTheme);

    /* renamed from: t */
    void mo19876t(@C12580l BannerConfiguration bannerConfiguration);

    /* renamed from: u */
    void mo19877u(@C12579k String str, @C12580l Bitmap bitmap, @C12580l UsabillaTheme usabillaTheme, @C12580l C9826e eVar);

    /* renamed from: v */
    void mo19878v(@C12579k Context context, @C12580l C9848g gVar);

    /* renamed from: w */
    boolean mo19879w();

    /* renamed from: x */
    void mo19880x(boolean z);

    @C12579k
    /* renamed from: y */
    C11907e<EventResult> mo19881y(@C12579k Context context, @C12579k String str);

    @C12579k
    /* renamed from: z */
    C9870g mo19882z();
}
