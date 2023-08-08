package com.usabilla.sdk.ubform.sdk.form.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.C9826e;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u00100\u001a\u00020\u0017\u0012\b\b\u0002\u00101\u001a\u00020\u0013\u0012\b\b\u0002\u00102\u001a\u00020\u001a\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\b\b\u0002\u00104\u001a\u00020\u001f\u0012\b\b\u0002\u00105\u001a\u00020\f\u0012\b\b\u0002\u00106\u001a\u00020\f\u0012\b\b\u0002\u00107\u001a\u00020\f\u0012\b\b\u0002\u00108\u001a\u00020\f\u0012\b\b\u0002\u00109\u001a\u00020\f\u0012\b\b\u0002\u0010:\u001a\u00020\f\u0012\b\b\u0002\u0010;\u001a\u00020\f\u0012\b\b\u0002\u0010<\u001a\u00020\f\u0012\b\b\u0002\u0010=\u001a\u00020\u0006\u0012\b\b\u0002\u0010>\u001a\u00020\u0006\u0012\b\b\u0002\u0010?\u001a\u00020\u0006\u0012\b\b\u0002\u0010@\u001a\u00020\u0006\u0012\b\b\u0002\u0010A\u001a\u00020\u0006\u0012\b\b\u0002\u0010B\u001a\u00020\u0006\u0012\b\b\u0002\u0010C\u001a\u00020\u0002¢\u0006\u0004\b}\u0010~J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\fJ\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0013HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003J\t\u0010 \u001a\u00020\u001fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0002HÆ\u0003J×\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u00172\b\b\u0002\u00101\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u00020\u001a2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u00104\u001a\u00020\u001f2\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u00020\f2\b\b\u0002\u00107\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\f2\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010:\u001a\u00020\f2\b\b\u0002\u0010;\u001a\u00020\f2\b\b\u0002\u0010<\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u00062\b\b\u0002\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u00062\b\b\u0002\u0010B\u001a\u00020\u00062\b\b\u0002\u0010C\u001a\u00020\u0002HÆ\u0001J\t\u0010E\u001a\u00020\fHÖ\u0001J\t\u0010F\u001a\u00020\u0002HÖ\u0001J\u0013\u0010I\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010J\u001a\u00020\u0002HÖ\u0001J\u0019\u0010O\u001a\u00020N2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u0002HÖ\u0001R\u0017\u00100\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b0\u0010P\u001a\u0004\bQ\u0010RR\u0017\u00101\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b1\u0010S\u001a\u0004\bT\u0010UR\u0017\u00102\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b2\u0010V\u001a\u0004\bW\u0010XR\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b3\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u00104\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b4\u0010\\\u001a\u0004\b]\u0010^R\u0017\u00105\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u0010_\u001a\u0004\b`\u0010aR\u0017\u00106\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u0010_\u001a\u0004\bb\u0010aR\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u0010_\u001a\u0004\bc\u0010aR\u0017\u00108\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u0010_\u001a\u0004\bd\u0010aR\u0017\u00109\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010_\u001a\u0004\be\u0010aR\u0017\u0010:\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010_\u001a\u0004\bf\u0010aR\u0017\u0010;\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010_\u001a\u0004\bg\u0010aR\u0017\u0010<\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010_\u001a\u0004\bh\u0010aR\u0017\u0010=\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010i\u001a\u0004\b=\u0010jR\u0017\u0010>\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010i\u001a\u0004\b>\u0010jR\u0017\u0010?\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010i\u001a\u0004\b?\u0010jR\u0017\u0010@\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010i\u001a\u0004\b@\u0010jR\u0017\u0010A\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010i\u001a\u0004\bk\u0010jR\u0017\u0010B\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u0010i\u001a\u0004\bB\u0010jR\"\u0010C\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\u00020\u00028\u0002XD¢\u0006\f\n\u0004\bq\u0010l\u0012\u0004\br\u0010sR2\u0010v\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010u\u0018\u00010t8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\bv\u0010w\u0012\u0004\b|\u0010s\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "Landroid/os/Parcelable;", "", "getSelectedMoodOrStarValue", "rating", "abandonedPageIndex", "", "isSent", "Lcom/usabilla/sdk/ubform/sdk/entity/FeedbackResult;", "generateFeedbackResult", "isMinValueForReviewReached", "pageIndex", "", "getButtonTextForIndex", "generateFeedbackResultFromPage", "generateFeedbackResultFromToast", "isCancelling", "generateFeedbackResultFromBanner", "shouldInviteForPlayStoreReview", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "newTheme", "mergeTheme", "generateEntriesString", "Lcom/usabilla/sdk/ubform/sdk/form/FormType;", "component1", "component2", "Landroid/os/Bundle;", "component3", "", "Lcom/usabilla/sdk/ubform/sdk/page/model/PageModel;", "component4", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "formType", "theme", "customVariables", "pages", "campaignBannerPosition", "errorMessage", "formId", "textButtonClose", "textButtonNext", "textButtonPlayStore", "textButtonSubmit", "titleScreenshot", "version", "isDefaultForm", "isPlayStoreRedirectEnabled", "isProgressBarVisible", "isScreenshotVisible", "areNavigationButtonsVisible", "isFooterLogoClickable", "currentPageIndex", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/usabilla/sdk/ubform/sdk/form/FormType;", "getFormType", "()Lcom/usabilla/sdk/ubform/sdk/form/FormType;", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "getTheme", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "Landroid/os/Bundle;", "getCustomVariables", "()Landroid/os/Bundle;", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;", "getCampaignBannerPosition", "()Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "getFormId", "getTextButtonClose", "getTextButtonNext", "getTextButtonPlayStore", "getTextButtonSubmit", "getTitleScreenshot", "getVersion", "Z", "()Z", "getAreNavigationButtonsVisible", "I", "getCurrentPageIndex", "()I", "setCurrentPageIndex", "(I)V", "minValuePlayStoreRedirect", "getMinValuePlayStoreRedirect$annotations", "()V", "Ljava/lang/ref/WeakReference;", "Lcom/usabilla/sdk/ubform/e;", "sdkCallbackReference", "Ljava/lang/ref/WeakReference;", "getSdkCallbackReference", "()Ljava/lang/ref/WeakReference;", "setSdkCallbackReference", "(Ljava/lang/ref/WeakReference;)V", "getSdkCallbackReference$annotations", "<init>", "(Lcom/usabilla/sdk/ubform/sdk/form/FormType;Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;Landroid/os/Bundle;Ljava/util/List;Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZI)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class FormModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<FormModel> CREATOR = new Creator();
    private final boolean areNavigationButtonsVisible;
    @C12579k
    private final BannerPosition campaignBannerPosition;
    private int currentPageIndex;
    @C12579k
    private final Bundle customVariables;
    @C12579k
    private final String errorMessage;
    @C12579k
    private final String formId;
    @C12579k
    private final FormType formType;
    private final boolean isDefaultForm;
    private final boolean isFooterLogoClickable;
    private final boolean isPlayStoreRedirectEnabled;
    private final boolean isProgressBarVisible;
    private final boolean isScreenshotVisible;
    private final int minValuePlayStoreRedirect;
    @C12579k
    private final List<PageModel> pages;
    @C12580l
    private WeakReference<C9826e> sdkCallbackReference;
    @C12579k
    private final String textButtonClose;
    @C12579k
    private final String textButtonNext;
    @C12579k
    private final String textButtonPlayStore;
    @C12579k
    private final String textButtonSubmit;
    @C12579k
    private final UbInternalTheme theme;
    @C12579k
    private final String titleScreenshot;
    @C12579k
    private final String version;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<FormModel> {
        @C12579k
        public final FormModel createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            FormType valueOf = FormType.valueOf(parcel.readString());
            UbInternalTheme createFromParcel = UbInternalTheme.CREATOR.createFromParcel(parcel2);
            Bundle readBundle = parcel.readBundle();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(PageModel.CREATOR.createFromParcel(parcel2));
            }
            return new FormModel(valueOf, createFromParcel, readBundle, arrayList, BannerPosition.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        @C12579k
        public final FormModel[] newArray(int i) {
            return new FormModel[i];
        }
    }

    public FormModel(@C12579k FormType formType2, @C12579k UbInternalTheme ubInternalTheme, @C12579k Bundle bundle, @C12579k List<PageModel> list, @C12579k BannerPosition bannerPosition, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        FormType formType3 = formType2;
        UbInternalTheme ubInternalTheme2 = ubInternalTheme;
        Bundle bundle2 = bundle;
        List<PageModel> list2 = list;
        BannerPosition bannerPosition2 = bannerPosition;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        Intrinsics.checkNotNullParameter(formType3, "formType");
        Intrinsics.checkNotNullParameter(ubInternalTheme2, C10108c.f27794S);
        Intrinsics.checkNotNullParameter(bundle2, "customVariables");
        Intrinsics.checkNotNullParameter(list2, "pages");
        Intrinsics.checkNotNullParameter(bannerPosition2, "campaignBannerPosition");
        Intrinsics.checkNotNullParameter(str9, C9874a.f27073r);
        Intrinsics.checkNotNullParameter(str10, "formId");
        Intrinsics.checkNotNullParameter(str11, "textButtonClose");
        Intrinsics.checkNotNullParameter(str12, "textButtonNext");
        Intrinsics.checkNotNullParameter(str13, "textButtonPlayStore");
        Intrinsics.checkNotNullParameter(str14, "textButtonSubmit");
        Intrinsics.checkNotNullParameter(str15, "titleScreenshot");
        Intrinsics.checkNotNullParameter(str16, "version");
        this.formType = formType3;
        this.theme = ubInternalTheme2;
        this.customVariables = bundle2;
        this.pages = list2;
        this.campaignBannerPosition = bannerPosition2;
        this.errorMessage = str9;
        this.formId = str10;
        this.textButtonClose = str11;
        this.textButtonNext = str12;
        this.textButtonPlayStore = str13;
        this.textButtonSubmit = str14;
        this.titleScreenshot = str15;
        this.version = str16;
        this.isDefaultForm = z;
        this.isPlayStoreRedirectEnabled = z2;
        this.isProgressBarVisible = z3;
        this.isScreenshotVisible = z4;
        this.areNavigationButtonsVisible = z5;
        this.isFooterLogoClickable = z6;
        this.currentPageIndex = i;
        this.minValuePlayStoreRedirect = 4;
    }

    public static /* synthetic */ FormModel copy$default(FormModel formModel, FormType formType2, UbInternalTheme ubInternalTheme, Bundle bundle, List list, BannerPosition bannerPosition, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, Object obj) {
        FormModel formModel2 = formModel;
        int i3 = i2;
        return formModel.copy((i3 & 1) != 0 ? formModel2.formType : formType2, (i3 & 2) != 0 ? formModel2.theme : ubInternalTheme, (i3 & 4) != 0 ? formModel2.customVariables : bundle, (i3 & 8) != 0 ? formModel2.pages : list, (i3 & 16) != 0 ? formModel2.campaignBannerPosition : bannerPosition, (i3 & 32) != 0 ? formModel2.errorMessage : str, (i3 & 64) != 0 ? formModel2.formId : str2, (i3 & 128) != 0 ? formModel2.textButtonClose : str3, (i3 & 256) != 0 ? formModel2.textButtonNext : str4, (i3 & 512) != 0 ? formModel2.textButtonPlayStore : str5, (i3 & 1024) != 0 ? formModel2.textButtonSubmit : str6, (i3 & 2048) != 0 ? formModel2.titleScreenshot : str7, (i3 & 4096) != 0 ? formModel2.version : str8, (i3 & 8192) != 0 ? formModel2.isDefaultForm : z, (i3 & 16384) != 0 ? formModel2.isPlayStoreRedirectEnabled : z2, (i3 & 32768) != 0 ? formModel2.isProgressBarVisible : z3, (i3 & 65536) != 0 ? formModel2.isScreenshotVisible : z4, (i3 & 131072) != 0 ? formModel2.areNavigationButtonsVisible : z5, (i3 & 262144) != 0 ? formModel2.isFooterLogoClickable : z6, (i3 & 524288) != 0 ? formModel2.currentPageIndex : i);
    }

    private final FeedbackResult generateFeedbackResult(int i, int i2, boolean z) {
        return new FeedbackResult(i, i2, z);
    }

    private static /* synthetic */ void getMinValuePlayStoreRedirect$annotations() {
    }

    public static /* synthetic */ void getSdkCallbackReference$annotations() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0006 A[LOOP:0: B:1:0x0006->B:20:0x0006, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getSelectedMoodOrStarValue() {
        /*
            r5 = this;
            java.util.List<com.usabilla.sdk.ubform.sdk.page.model.PageModel> r0 = r5.pages
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r0.next()
            com.usabilla.sdk.ubform.sdk.page.model.PageModel r1 = (com.usabilla.sdk.ubform.sdk.page.model.PageModel) r1
            java.util.List r1 = r1.mo21412n()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0006
            java.lang.Object r2 = r1.next()
            com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel r2 = (com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel) r2
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldType r3 = r2.mo20972c()
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldType r4 = com.usabilla.sdk.ubform.sdk.field.view.common.FieldType.MOOD
            if (r3 == r4) goto L_0x0034
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldType r4 = com.usabilla.sdk.ubform.sdk.field.view.common.FieldType.STAR
            if (r3 != r4) goto L_0x001c
        L_0x0034:
            java.lang.Object r0 = r2.mo20973d()
            if (r0 == 0) goto L_0x0041
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0041:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.form.model.FormModel.getSelectedMoodOrStarValue():int");
    }

    private final boolean isMinValueForReviewReached() {
        return getSelectedMoodOrStarValue() >= this.minValuePlayStoreRedirect;
    }

    @C12579k
    public final FormType component1() {
        return this.formType;
    }

    @C12579k
    public final String component10() {
        return this.textButtonPlayStore;
    }

    @C12579k
    public final String component11() {
        return this.textButtonSubmit;
    }

    @C12579k
    public final String component12() {
        return this.titleScreenshot;
    }

    @C12579k
    public final String component13() {
        return this.version;
    }

    public final boolean component14() {
        return this.isDefaultForm;
    }

    public final boolean component15() {
        return this.isPlayStoreRedirectEnabled;
    }

    public final boolean component16() {
        return this.isProgressBarVisible;
    }

    public final boolean component17() {
        return this.isScreenshotVisible;
    }

    public final boolean component18() {
        return this.areNavigationButtonsVisible;
    }

    public final boolean component19() {
        return this.isFooterLogoClickable;
    }

    @C12579k
    public final UbInternalTheme component2() {
        return this.theme;
    }

    public final int component20() {
        return this.currentPageIndex;
    }

    @C12579k
    public final Bundle component3() {
        return this.customVariables;
    }

    @C12579k
    public final List<PageModel> component4() {
        return this.pages;
    }

    @C12579k
    public final BannerPosition component5() {
        return this.campaignBannerPosition;
    }

    @C12579k
    public final String component6() {
        return this.errorMessage;
    }

    @C12579k
    public final String component7() {
        return this.formId;
    }

    @C12579k
    public final String component8() {
        return this.textButtonClose;
    }

    @C12579k
    public final String component9() {
        return this.textButtonNext;
    }

    @C12579k
    public final FormModel copy(@C12579k FormType formType2, @C12579k UbInternalTheme ubInternalTheme, @C12579k Bundle bundle, @C12579k List<PageModel> list, @C12579k BannerPosition bannerPosition, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        FormType formType3 = formType2;
        Intrinsics.checkNotNullParameter(formType3, "formType");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        Intrinsics.checkNotNullParameter(bundle, "customVariables");
        Intrinsics.checkNotNullParameter(list, "pages");
        Intrinsics.checkNotNullParameter(bannerPosition, "campaignBannerPosition");
        Intrinsics.checkNotNullParameter(str, C9874a.f27073r);
        Intrinsics.checkNotNullParameter(str2, "formId");
        Intrinsics.checkNotNullParameter(str3, "textButtonClose");
        Intrinsics.checkNotNullParameter(str4, "textButtonNext");
        Intrinsics.checkNotNullParameter(str5, "textButtonPlayStore");
        Intrinsics.checkNotNullParameter(str6, "textButtonSubmit");
        Intrinsics.checkNotNullParameter(str7, "titleScreenshot");
        Intrinsics.checkNotNullParameter(str8, "version");
        return new FormModel(formType3, ubInternalTheme, bundle, list, bannerPosition, str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, z5, z6, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormModel)) {
            return false;
        }
        FormModel formModel = (FormModel) obj;
        return this.formType == formModel.formType && Intrinsics.areEqual((Object) this.theme, (Object) formModel.theme) && Intrinsics.areEqual((Object) this.customVariables, (Object) formModel.customVariables) && Intrinsics.areEqual((Object) this.pages, (Object) formModel.pages) && this.campaignBannerPosition == formModel.campaignBannerPosition && Intrinsics.areEqual((Object) this.errorMessage, (Object) formModel.errorMessage) && Intrinsics.areEqual((Object) this.formId, (Object) formModel.formId) && Intrinsics.areEqual((Object) this.textButtonClose, (Object) formModel.textButtonClose) && Intrinsics.areEqual((Object) this.textButtonNext, (Object) formModel.textButtonNext) && Intrinsics.areEqual((Object) this.textButtonPlayStore, (Object) formModel.textButtonPlayStore) && Intrinsics.areEqual((Object) this.textButtonSubmit, (Object) formModel.textButtonSubmit) && Intrinsics.areEqual((Object) this.titleScreenshot, (Object) formModel.titleScreenshot) && Intrinsics.areEqual((Object) this.version, (Object) formModel.version) && this.isDefaultForm == formModel.isDefaultForm && this.isPlayStoreRedirectEnabled == formModel.isPlayStoreRedirectEnabled && this.isProgressBarVisible == formModel.isProgressBarVisible && this.isScreenshotVisible == formModel.isScreenshotVisible && this.areNavigationButtonsVisible == formModel.areNavigationButtonsVisible && this.isFooterLogoClickable == formModel.isFooterLogoClickable && this.currentPageIndex == formModel.currentPageIndex;
    }

    @C12579k
    public final String generateEntriesString() {
        boolean z;
        Iterable<PageModel> iterable = this.pages;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (PageModel n : iterable) {
            arrayList.add(n.mo21412n());
        }
        ArrayList<FieldModel> arrayList2 = new ArrayList<>();
        for (Object next : C10978t.m41497a0(arrayList)) {
            FieldModel fieldModel = (FieldModel) next;
            if (fieldModel.mo20972c() == FieldType.SCREENSHOT || fieldModel.mo20972c() == FieldType.CONTINUE || fieldModel.mo20974e() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(arrayList2, 10));
        for (FieldModel fieldModel2 : arrayList2) {
            arrayList3.add(C11078d1.m42659a(fieldModel2.mo20974e(), fieldModel2.mo20973d()));
        }
        return C10977s0.m41426B0(arrayList3).toString();
    }

    @C12579k
    public final FeedbackResult generateFeedbackResultFromBanner(boolean z) {
        return generateFeedbackResult(getSelectedMoodOrStarValue(), 0, !z);
    }

    @C12579k
    public final FeedbackResult generateFeedbackResultFromPage() {
        int selectedMoodOrStarValue = getSelectedMoodOrStarValue();
        int i = this.currentPageIndex;
        boolean z = true;
        if (i != this.pages.size() - 1) {
            z = false;
        }
        return generateFeedbackResult(selectedMoodOrStarValue, i, z);
    }

    @C12579k
    public final FeedbackResult generateFeedbackResultFromToast() {
        return generateFeedbackResult(getSelectedMoodOrStarValue(), this.currentPageIndex, true);
    }

    public final boolean getAreNavigationButtonsVisible() {
        return this.areNavigationButtonsVisible;
    }

    @C12579k
    public final String getButtonTextForIndex(int i) {
        if (i < 0) {
            return "";
        }
        PageModel pageModel = this.pages.get(i);
        String str = this.textButtonNext;
        if (pageModel.mo21420u()) {
            return this.textButtonClose;
        }
        if (pageModel.mo21416r()) {
            return this.textButtonSubmit;
        }
        return str;
    }

    @C12579k
    public final BannerPosition getCampaignBannerPosition() {
        return this.campaignBannerPosition;
    }

    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    @C12579k
    public final Bundle getCustomVariables() {
        return this.customVariables;
    }

    @C12579k
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @C12579k
    public final String getFormId() {
        return this.formId;
    }

    @C12579k
    public final FormType getFormType() {
        return this.formType;
    }

    @C12579k
    public final List<PageModel> getPages() {
        return this.pages;
    }

    @C12580l
    public final WeakReference<C9826e> getSdkCallbackReference() {
        return this.sdkCallbackReference;
    }

    @C12579k
    public final String getTextButtonClose() {
        return this.textButtonClose;
    }

    @C12579k
    public final String getTextButtonNext() {
        return this.textButtonNext;
    }

    @C12579k
    public final String getTextButtonPlayStore() {
        return this.textButtonPlayStore;
    }

    @C12579k
    public final String getTextButtonSubmit() {
        return this.textButtonSubmit;
    }

    @C12579k
    public final UbInternalTheme getTheme() {
        return this.theme;
    }

    @C12579k
    public final String getTitleScreenshot() {
        return this.titleScreenshot;
    }

    @C12579k
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.formType.hashCode() * 31) + this.theme.hashCode()) * 31) + this.customVariables.hashCode()) * 31) + this.pages.hashCode()) * 31) + this.campaignBannerPosition.hashCode()) * 31) + this.errorMessage.hashCode()) * 31) + this.formId.hashCode()) * 31) + this.textButtonClose.hashCode()) * 31) + this.textButtonNext.hashCode()) * 31) + this.textButtonPlayStore.hashCode()) * 31) + this.textButtonSubmit.hashCode()) * 31) + this.titleScreenshot.hashCode()) * 31) + this.version.hashCode()) * 31;
        boolean z = this.isDefaultForm;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isPlayStoreRedirectEnabled;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isProgressBarVisible;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isScreenshotVisible;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.areNavigationButtonsVisible;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.isFooterLogoClickable;
        if (!z7) {
            z2 = z7;
        }
        return ((i5 + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.currentPageIndex);
    }

    public final boolean isDefaultForm() {
        return this.isDefaultForm;
    }

    public final boolean isFooterLogoClickable() {
        return this.isFooterLogoClickable;
    }

    public final boolean isPlayStoreRedirectEnabled() {
        return this.isPlayStoreRedirectEnabled;
    }

    public final boolean isProgressBarVisible() {
        return this.isProgressBarVisible;
    }

    public final boolean isScreenshotVisible() {
        return this.isScreenshotVisible;
    }

    @C12579k
    public final FormModel mergeTheme(@C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(ubInternalTheme, "newTheme");
        UbInternalTheme copy$default = UbInternalTheme.copy$default(ubInternalTheme, (UsabillaThemeUnity) null, this.theme.getColors(), (UbColors) null, (UbFonts) null, (UbImages) null, false, 61, (Object) null);
        for (PageModel n : this.pages) {
            for (FieldModel v : n.mo21412n()) {
                v.mo20988v(copy$default);
            }
        }
        return copy$default(this, (FormType) null, copy$default, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048573, (Object) null);
    }

    public final void setCurrentPageIndex(int i) {
        this.currentPageIndex = i;
    }

    public final void setSdkCallbackReference(@C12580l WeakReference<C9826e> weakReference) {
        this.sdkCallbackReference = weakReference;
    }

    public final boolean shouldInviteForPlayStoreReview() {
        return this.isPlayStoreRedirectEnabled && isMinValueForReviewReached();
    }

    @C12579k
    public String toString() {
        return "FormModel(formType=" + this.formType + ", theme=" + this.theme + ", customVariables=" + this.customVariables + ", pages=" + this.pages + ", campaignBannerPosition=" + this.campaignBannerPosition + ", errorMessage=" + this.errorMessage + ", formId=" + this.formId + ", textButtonClose=" + this.textButtonClose + ", textButtonNext=" + this.textButtonNext + ", textButtonPlayStore=" + this.textButtonPlayStore + ", textButtonSubmit=" + this.textButtonSubmit + ", titleScreenshot=" + this.titleScreenshot + ", version=" + this.version + ", isDefaultForm=" + this.isDefaultForm + ", isPlayStoreRedirectEnabled=" + this.isPlayStoreRedirectEnabled + ", isProgressBarVisible=" + this.isProgressBarVisible + ", isScreenshotVisible=" + this.isScreenshotVisible + ", areNavigationButtonsVisible=" + this.areNavigationButtonsVisible + ", isFooterLogoClickable=" + this.isFooterLogoClickable + ", currentPageIndex=" + this.currentPageIndex + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.formType.name());
        this.theme.writeToParcel(parcel, i);
        parcel.writeBundle(this.customVariables);
        List<PageModel> list = this.pages;
        parcel.writeInt(list.size());
        for (PageModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.campaignBannerPosition.name());
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.formId);
        parcel.writeString(this.textButtonClose);
        parcel.writeString(this.textButtonNext);
        parcel.writeString(this.textButtonPlayStore);
        parcel.writeString(this.textButtonSubmit);
        parcel.writeString(this.titleScreenshot);
        parcel.writeString(this.version);
        parcel.writeInt(this.isDefaultForm ? 1 : 0);
        parcel.writeInt(this.isPlayStoreRedirectEnabled ? 1 : 0);
        parcel.writeInt(this.isProgressBarVisible ? 1 : 0);
        parcel.writeInt(this.isScreenshotVisible ? 1 : 0);
        parcel.writeInt(this.areNavigationButtonsVisible ? 1 : 0);
        parcel.writeInt(this.isFooterLogoClickable ? 1 : 0);
        parcel.writeInt(this.currentPageIndex);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FormModel(com.usabilla.sdk.ubform.sdk.form.FormType r22, com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme r23, android.os.Bundle r24, java.util.List r25, com.usabilla.sdk.ubform.sdk.banner.BannerPosition r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, int r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0016
            com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme r1 = new com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            r10 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0018
        L_0x0016:
            r1 = r23
        L_0x0018:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0022
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            goto L_0x0024
        L_0x0022:
            r2 = r24
        L_0x0024:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x002e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x0030
        L_0x002e:
            r3 = r25
        L_0x0030:
            r4 = r0 & 16
            if (r4 == 0) goto L_0x0037
            com.usabilla.sdk.ubform.sdk.banner.BannerPosition r4 = com.usabilla.sdk.ubform.sdk.banner.BannerPosition.BOTTOM
            goto L_0x0039
        L_0x0037:
            r4 = r26
        L_0x0039:
            r5 = r0 & 32
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0041
            r5 = r6
            goto L_0x0043
        L_0x0041:
            r5 = r27
        L_0x0043:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0049
            r7 = r6
            goto L_0x004b
        L_0x0049:
            r7 = r28
        L_0x004b:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0051
            r8 = r6
            goto L_0x0053
        L_0x0051:
            r8 = r29
        L_0x0053:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0059
            r9 = r6
            goto L_0x005b
        L_0x0059:
            r9 = r30
        L_0x005b:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0061
            r10 = r6
            goto L_0x0063
        L_0x0061:
            r10 = r31
        L_0x0063:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0069
            r11 = r6
            goto L_0x006b
        L_0x0069:
            r11 = r32
        L_0x006b:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0071
            r12 = r6
            goto L_0x0073
        L_0x0071:
            r12 = r33
        L_0x0073:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r6 = r34
        L_0x007a:
            r13 = r0 & 8192(0x2000, float:1.14794E-41)
            r14 = 0
            if (r13 == 0) goto L_0x0081
            r13 = r14
            goto L_0x0083
        L_0x0081:
            r13 = r35
        L_0x0083:
            r15 = r0 & 16384(0x4000, float:2.2959E-41)
            r16 = 1
            if (r15 == 0) goto L_0x008c
            r15 = r16
            goto L_0x008e
        L_0x008c:
            r15 = r36
        L_0x008e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0098
            r17 = r14
            goto L_0x009a
        L_0x0098:
            r17 = r37
        L_0x009a:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a3
            r18 = r14
            goto L_0x00a5
        L_0x00a3:
            r18 = r38
        L_0x00a5:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00ae
            r19 = r16
            goto L_0x00b0
        L_0x00ae:
            r19 = r39
        L_0x00b0:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r16 = r40
        L_0x00b9:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r14 = r41
        L_0x00c2:
            r23 = r21
            r24 = r22
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r7
            r31 = r8
            r32 = r9
            r33 = r10
            r34 = r11
            r35 = r12
            r36 = r6
            r37 = r13
            r38 = r15
            r39 = r17
            r40 = r18
            r41 = r19
            r42 = r16
            r43 = r14
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.form.model.FormModel.<init>(com.usabilla.sdk.ubform.sdk.form.FormType, com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme, android.os.Bundle, java.util.List, com.usabilla.sdk.ubform.sdk.banner.BannerPosition, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
