package com.usabilla.sdk.ubform.sdk.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0018"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/entity/FeedbackResult;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "a", "I", "b", "()I", "rating", "abandonPageIndex", "", "c", "Z", "()Z", "isSent", "abandonedPageIndex", "<init>", "(IIZ)V", "d", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class FeedbackResult implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<FeedbackResult> CREATOR = new C9949b();
    @C12579k

    /* renamed from: d */
    public static final C9948a f27416d = new C9948a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f27417e = "feedbackResult";
    @C12579k

    /* renamed from: f */
    public static final String f27418f = "feedbackResultCampaign";
    @C12579k

    /* renamed from: g */
    public static final String f27419g = "feedbackEntries";

    /* renamed from: a */
    public final int f27420a;

    /* renamed from: b */
    public final int f27421b;

    /* renamed from: c */
    public final boolean f27422c;

    /* renamed from: com.usabilla.sdk.ubform.sdk.entity.FeedbackResult$a */
    public static final class C9948a {
        public /* synthetic */ C9948a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9948a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.entity.FeedbackResult$b */
    public static final class C9949b implements Parcelable.Creator<FeedbackResult> {
        @C12579k
        /* renamed from: a */
        public final FeedbackResult createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedbackResult(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final FeedbackResult[] newArray(int i) {
            return new FeedbackResult[i];
        }
    }

    public FeedbackResult(int i, int i2, boolean z) {
        this.f27420a = i;
        this.f27421b = i2;
        this.f27422c = z;
    }

    /* renamed from: a */
    public final int mo20797a() {
        if (this.f27422c) {
            return -1;
        }
        return this.f27421b;
    }

    /* renamed from: b */
    public final int mo20798b() {
        return this.f27420a;
    }

    /* renamed from: c */
    public final boolean mo20799c() {
        return this.f27422c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f27420a);
        parcel.writeInt(this.f27421b);
        parcel.writeInt(this.f27422c ? 1 : 0);
    }
}
