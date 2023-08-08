package com.usabilla.sdk.ubform.eventengine;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/EventResult;", "Landroid/os/Parcelable;", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "a", "", "b", "formModel", "campaignId", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "f", "()Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class EventResult implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<EventResult> CREATOR = new C9829a();
    @C12579k

    /* renamed from: a */
    public final FormModel f26882a;
    @C12579k

    /* renamed from: b */
    public final String f26883b;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.EventResult$a */
    public static final class C9829a implements Parcelable.Creator<EventResult> {
        @C12579k
        /* renamed from: a */
        public final EventResult createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventResult(FormModel.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final EventResult[] newArray(int i) {
            return new EventResult[i];
        }
    }

    public EventResult(@C12579k FormModel formModel, @C12579k String str) {
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(str, "campaignId");
        this.f26882a = formModel;
        this.f26883b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ EventResult m36783d(EventResult eventResult, FormModel formModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            formModel = eventResult.f26882a;
        }
        if ((i & 2) != 0) {
            str = eventResult.f26883b;
        }
        return eventResult.mo20174c(formModel, str);
    }

    @C12579k
    /* renamed from: a */
    public final FormModel mo20172a() {
        return this.f26882a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo20173b() {
        return this.f26883b;
    }

    @C12579k
    /* renamed from: c */
    public final EventResult mo20174c(@C12579k FormModel formModel, @C12579k String str) {
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return new EventResult(formModel, str);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo20176e() {
        return this.f26883b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventResult)) {
            return false;
        }
        EventResult eventResult = (EventResult) obj;
        return Intrinsics.areEqual((Object) this.f26882a, (Object) eventResult.f26882a) && Intrinsics.areEqual((Object) this.f26883b, (Object) eventResult.f26883b);
    }

    @C12579k
    /* renamed from: f */
    public final FormModel mo20178f() {
        return this.f26882a;
    }

    public int hashCode() {
        return (this.f26882a.hashCode() * 31) + this.f26883b.hashCode();
    }

    @C12579k
    public String toString() {
        return "EventResult(formModel=" + this.f26882a + ", campaignId=" + this.f26883b + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f26882a.writeToParcel(parcel, i);
        parcel.writeString(this.f26883b);
    }
}
