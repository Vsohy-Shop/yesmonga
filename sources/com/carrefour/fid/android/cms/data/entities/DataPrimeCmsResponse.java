package com.carrefour.fid.android.cms.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b>\u0010?J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J_\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\fHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0018HÖ\u0001R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b\u0015\u0010;\"\u0004\b<\u0010=¨\u0006@"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/carrefour/fid/android/cms/data/entities/PictoPrimeCmsResponse;", "component3", "component4", "Lcom/carrefour/fid/android/cms/data/entities/UrlPrimeCmsResponse;", "component5", "component6", "component7", "", "component8", "name", "primeId", "pictoMobile", "pictoMobileOff", "urlEdito", "description", "text", "isSelected", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPrimeId", "setPrimeId", "Lcom/carrefour/fid/android/cms/data/entities/PictoPrimeCmsResponse;", "getPictoMobile", "()Lcom/carrefour/fid/android/cms/data/entities/PictoPrimeCmsResponse;", "setPictoMobile", "(Lcom/carrefour/fid/android/cms/data/entities/PictoPrimeCmsResponse;)V", "getPictoMobileOff", "setPictoMobileOff", "Lcom/carrefour/fid/android/cms/data/entities/UrlPrimeCmsResponse;", "getUrlEdito", "()Lcom/carrefour/fid/android/cms/data/entities/UrlPrimeCmsResponse;", "setUrlEdito", "(Lcom/carrefour/fid/android/cms/data/entities/UrlPrimeCmsResponse;)V", "getDescription", "setDescription", "getText", "setText", "Z", "()Z", "setSelected", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/cms/data/entities/PictoPrimeCmsResponse;Lcom/carrefour/fid/android/cms/data/entities/PictoPrimeCmsResponse;Lcom/carrefour/fid/android/cms/data/entities/UrlPrimeCmsResponse;Ljava/lang/String;Ljava/lang/String;Z)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class DataPrimeCmsResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<DataPrimeCmsResponse> CREATOR = new C40013a();
    @C33608c("description")
    @C12579k
    private String description;
    private boolean isSelected;
    @C33608c("name")
    @C12579k
    private String name;
    @C33608c("picto_mobile")
    @C12580l
    private PictoPrimeCmsResponse pictoMobile;
    @C33608c("picto_mobile_off")
    @C12580l
    private PictoPrimeCmsResponse pictoMobileOff;
    @C33608c("prime_id")
    @C12579k
    private String primeId;
    @C33608c("text")
    @C12579k
    private String text;
    @C33608c("url_edito")
    @C12580l
    private UrlPrimeCmsResponse urlEdito;

    /* renamed from: com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse$a */
    public static final class C40013a implements Parcelable.Creator<DataPrimeCmsResponse> {
        @C12579k
        /* renamed from: a */
        public final DataPrimeCmsResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            UrlPrimeCmsResponse urlPrimeCmsResponse = null;
            PictoPrimeCmsResponse createFromParcel = parcel.readInt() == 0 ? null : PictoPrimeCmsResponse.CREATOR.createFromParcel(parcel);
            PictoPrimeCmsResponse createFromParcel2 = parcel.readInt() == 0 ? null : PictoPrimeCmsResponse.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                urlPrimeCmsResponse = UrlPrimeCmsResponse.CREATOR.createFromParcel(parcel);
            }
            return new DataPrimeCmsResponse(readString, readString2, createFromParcel, createFromParcel2, urlPrimeCmsResponse, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final DataPrimeCmsResponse[] newArray(int i) {
            return new DataPrimeCmsResponse[i];
        }
    }

    public DataPrimeCmsResponse() {
        this((String) null, (String) null, (PictoPrimeCmsResponse) null, (PictoPrimeCmsResponse) null, (UrlPrimeCmsResponse) null, (String) null, (String) null, false, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DataPrimeCmsResponse copy$default(DataPrimeCmsResponse dataPrimeCmsResponse, String str, String str2, PictoPrimeCmsResponse pictoPrimeCmsResponse, PictoPrimeCmsResponse pictoPrimeCmsResponse2, UrlPrimeCmsResponse urlPrimeCmsResponse, String str3, String str4, boolean z, int i, Object obj) {
        DataPrimeCmsResponse dataPrimeCmsResponse2 = dataPrimeCmsResponse;
        int i2 = i;
        return dataPrimeCmsResponse.copy((i2 & 1) != 0 ? dataPrimeCmsResponse2.name : str, (i2 & 2) != 0 ? dataPrimeCmsResponse2.primeId : str2, (i2 & 4) != 0 ? dataPrimeCmsResponse2.pictoMobile : pictoPrimeCmsResponse, (i2 & 8) != 0 ? dataPrimeCmsResponse2.pictoMobileOff : pictoPrimeCmsResponse2, (i2 & 16) != 0 ? dataPrimeCmsResponse2.urlEdito : urlPrimeCmsResponse, (i2 & 32) != 0 ? dataPrimeCmsResponse2.description : str3, (i2 & 64) != 0 ? dataPrimeCmsResponse2.text : str4, (i2 & 128) != 0 ? dataPrimeCmsResponse2.isSelected : z);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component2() {
        return this.primeId;
    }

    @C12580l
    public final PictoPrimeCmsResponse component3() {
        return this.pictoMobile;
    }

    @C12580l
    public final PictoPrimeCmsResponse component4() {
        return this.pictoMobileOff;
    }

    @C12580l
    public final UrlPrimeCmsResponse component5() {
        return this.urlEdito;
    }

    @C12579k
    public final String component6() {
        return this.description;
    }

    @C12579k
    public final String component7() {
        return this.text;
    }

    public final boolean component8() {
        return this.isSelected;
    }

    @C12579k
    public final DataPrimeCmsResponse copy(@C12579k String str, @C12579k String str2, @C12580l PictoPrimeCmsResponse pictoPrimeCmsResponse, @C12580l PictoPrimeCmsResponse pictoPrimeCmsResponse2, @C12580l UrlPrimeCmsResponse urlPrimeCmsResponse, @C12579k String str3, @C12579k String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "primeId");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "description");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "text");
        return new DataPrimeCmsResponse(str, str2, pictoPrimeCmsResponse, pictoPrimeCmsResponse2, urlPrimeCmsResponse, str5, str6, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPrimeCmsResponse)) {
            return false;
        }
        DataPrimeCmsResponse dataPrimeCmsResponse = (DataPrimeCmsResponse) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) dataPrimeCmsResponse.name) && Intrinsics.areEqual((Object) this.primeId, (Object) dataPrimeCmsResponse.primeId) && Intrinsics.areEqual((Object) this.pictoMobile, (Object) dataPrimeCmsResponse.pictoMobile) && Intrinsics.areEqual((Object) this.pictoMobileOff, (Object) dataPrimeCmsResponse.pictoMobileOff) && Intrinsics.areEqual((Object) this.urlEdito, (Object) dataPrimeCmsResponse.urlEdito) && Intrinsics.areEqual((Object) this.description, (Object) dataPrimeCmsResponse.description) && Intrinsics.areEqual((Object) this.text, (Object) dataPrimeCmsResponse.text) && this.isSelected == dataPrimeCmsResponse.isSelected;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final PictoPrimeCmsResponse getPictoMobile() {
        return this.pictoMobile;
    }

    @C12580l
    public final PictoPrimeCmsResponse getPictoMobileOff() {
        return this.pictoMobileOff;
    }

    @C12579k
    public final String getPrimeId() {
        return this.primeId;
    }

    @C12579k
    public final String getText() {
        return this.text;
    }

    @C12580l
    public final UrlPrimeCmsResponse getUrlEdito() {
        return this.urlEdito;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.primeId.hashCode()) * 31;
        PictoPrimeCmsResponse pictoPrimeCmsResponse = this.pictoMobile;
        int i = 0;
        int hashCode2 = (hashCode + (pictoPrimeCmsResponse == null ? 0 : pictoPrimeCmsResponse.hashCode())) * 31;
        PictoPrimeCmsResponse pictoPrimeCmsResponse2 = this.pictoMobileOff;
        int hashCode3 = (hashCode2 + (pictoPrimeCmsResponse2 == null ? 0 : pictoPrimeCmsResponse2.hashCode())) * 31;
        UrlPrimeCmsResponse urlPrimeCmsResponse = this.urlEdito;
        if (urlPrimeCmsResponse != null) {
            i = urlPrimeCmsResponse.hashCode();
        }
        int hashCode4 = (((((hashCode3 + i) * 31) + this.description.hashCode()) * 31) + this.text.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode4 + (z ? 1 : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setDescription(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPictoMobile(@C12580l PictoPrimeCmsResponse pictoPrimeCmsResponse) {
        this.pictoMobile = pictoPrimeCmsResponse;
    }

    public final void setPictoMobileOff(@C12580l PictoPrimeCmsResponse pictoPrimeCmsResponse) {
        this.pictoMobileOff = pictoPrimeCmsResponse;
    }

    public final void setPrimeId(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.primeId = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setText(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final void setUrlEdito(@C12580l UrlPrimeCmsResponse urlPrimeCmsResponse) {
        this.urlEdito = urlPrimeCmsResponse;
    }

    @C12579k
    public String toString() {
        String str = this.name;
        String str2 = this.primeId;
        PictoPrimeCmsResponse pictoPrimeCmsResponse = this.pictoMobile;
        PictoPrimeCmsResponse pictoPrimeCmsResponse2 = this.pictoMobileOff;
        UrlPrimeCmsResponse urlPrimeCmsResponse = this.urlEdito;
        String str3 = this.description;
        String str4 = this.text;
        boolean z = this.isSelected;
        return "DataPrimeCmsResponse(name=" + str + ", primeId=" + str2 + ", pictoMobile=" + pictoPrimeCmsResponse + ", pictoMobileOff=" + pictoPrimeCmsResponse2 + ", urlEdito=" + urlPrimeCmsResponse + ", description=" + str3 + ", text=" + str4 + ", isSelected=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.primeId);
        PictoPrimeCmsResponse pictoPrimeCmsResponse = this.pictoMobile;
        if (pictoPrimeCmsResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pictoPrimeCmsResponse.writeToParcel(parcel, i);
        }
        PictoPrimeCmsResponse pictoPrimeCmsResponse2 = this.pictoMobileOff;
        if (pictoPrimeCmsResponse2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pictoPrimeCmsResponse2.writeToParcel(parcel, i);
        }
        UrlPrimeCmsResponse urlPrimeCmsResponse = this.urlEdito;
        if (urlPrimeCmsResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            urlPrimeCmsResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.text);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public DataPrimeCmsResponse(@C12579k String str, @C12579k String str2, @C12580l PictoPrimeCmsResponse pictoPrimeCmsResponse, @C12580l PictoPrimeCmsResponse pictoPrimeCmsResponse2, @C12580l UrlPrimeCmsResponse urlPrimeCmsResponse, @C12579k String str3, @C12579k String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "primeId");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(str4, "text");
        this.name = str;
        this.primeId = str2;
        this.pictoMobile = pictoPrimeCmsResponse;
        this.pictoMobileOff = pictoPrimeCmsResponse2;
        this.urlEdito = urlPrimeCmsResponse;
        this.description = str3;
        this.text = str4;
        this.isSelected = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DataPrimeCmsResponse(java.lang.String r9, java.lang.String r10, com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse r11, com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse r12, com.carrefour.fid.android.cms.data.entities.UrlPrimeCmsResponse r13, java.lang.String r14, java.lang.String r15, boolean r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r9
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r10
        L_0x0018:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x001f
            r3 = r4
            goto L_0x0020
        L_0x001f:
            r3 = r11
        L_0x0020:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0026
            r5 = r4
            goto L_0x0027
        L_0x0026:
            r5 = r12
        L_0x0027:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r4 = r13
        L_0x002d:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0037
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0038
        L_0x0037:
            r6 = r14
        L_0x0038:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0042
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0043
        L_0x0042:
            r7 = r15
        L_0x0043:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004b
        L_0x0049:
            r0 = r16
        L_0x004b:
            r9 = r8
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r5
            r14 = r4
            r15 = r6
            r16 = r7
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse.<init>(java.lang.String, java.lang.String, com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse, com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse, com.carrefour.fid.android.cms.data.entities.UrlPrimeCmsResponse, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
