package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.usabilla.sdk.ubform.bus.Bus;
import com.usabilla.sdk.ubform.bus.BusEvent;
import com.usabilla.sdk.ubform.bus.C9746b;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b1\u00102J%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001J \u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0002J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\t\u0010%\u001a\u00020\rHÂ\u0003R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u000e8\u0002X\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u0012\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b+\u0010&\u0012\u0004\b,\u0010)R\u001a\u00100\u001a\u00020\r8\u0002XD¢\u0006\f\n\u0004\b.\u0010&\u0012\u0004\b/\u0010)¨\u00063"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/model/common/ClientModel;", "Lcom/usabilla/sdk/ubform/bus/b;", "Landroid/os/Parcelable;", "T", "Lcom/usabilla/sdk/ubform/bus/BusEvent;", "event", "payload", "Lkotlin/d2;", "v", "(Lcom/usabilla/sdk/ubform/bus/BusEvent;Ljava/lang/Object;)V", "j", "k", "Lkotlin/Pair;", "", "Lorg/json/JSONObject;", "e", "jsonString", "b", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "key", "valueFromPayload", "valueFromBehavior", "i", "srcJson", "destJson", "h", "a", "Ljava/lang/String;", "Lorg/json/JSONObject;", "getBehaviour$annotations", "()V", "behaviour", "c", "getKeyClient$annotations", "keyClient", "d", "getKeyBehaviour$annotations", "keyBehaviour", "<init>", "(Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class ClientModel implements C9746b, Parcelable {
    @C12579k
    public static final Parcelable.Creator<ClientModel> CREATOR = new C10008a();
    @C12579k

    /* renamed from: a */
    public String f27471a;
    @C12579k

    /* renamed from: b */
    public final JSONObject f27472b;
    @C12579k

    /* renamed from: c */
    public final String f27473c;
    @C12579k

    /* renamed from: d */
    public final String f27474d;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.ClientModel$a */
    public static final class C10008a implements Parcelable.Creator<ClientModel> {
        @C12579k
        /* renamed from: a */
        public final ClientModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClientModel(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final ClientModel[] newArray(int i) {
            return new ClientModel[i];
        }
    }

    public ClientModel() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ ClientModel m37658c(ClientModel clientModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientModel.f27471a;
        }
        return clientModel.mo20957b(str);
    }

    /* renamed from: d */
    public static /* synthetic */ void m37659d() {
    }

    /* renamed from: f */
    public static /* synthetic */ void m37660f() {
    }

    /* renamed from: g */
    public static /* synthetic */ void m37661g() {
    }

    /* renamed from: a */
    public final String mo20956a() {
        return this.f27471a;
    }

    @C12579k
    /* renamed from: b */
    public final ClientModel mo20957b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "jsonString");
        return new ClientModel(str);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final Pair<String, JSONObject> mo20959e() {
        return C11078d1.m42659a(this.f27473c, new JSONObject().put(this.f27474d, this.f27472b));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientModel) && Intrinsics.areEqual((Object) this.f27471a, (Object) ((ClientModel) obj).f27471a);
    }

    /* renamed from: h */
    public final void mo20961h(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str = next;
                jSONObject2.put(str, jSONObject.get(str));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    public int hashCode() {
        return this.f27471a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo20963i(String str, Object obj, Object obj2) {
        if (!(obj2 instanceof JSONObject) || !(obj instanceof JSONObject)) {
            return false;
        }
        mo20961h((JSONObject) obj, (JSONObject) obj2);
        this.f27472b.put(str, obj2);
        return true;
    }

    /* renamed from: j */
    public final void mo20964j() {
        Bus.f26721a.mo19919b(BusEvent.CLIENT_BEHAVIOR, this);
    }

    /* renamed from: k */
    public final void mo20965k() {
        Bus.f26721a.mo19921d(BusEvent.CLIENT_BEHAVIOR);
        String jSONObject = this.f27472b.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "behaviour.toString()");
        this.f27471a = jSONObject;
    }

    @C12579k
    public String toString() {
        return "ClientModel(jsonString=" + this.f27471a + ')';
    }

    /* renamed from: v */
    public <T> void mo19932v(@C12579k BusEvent busEvent, T t) {
        Intrinsics.checkNotNullParameter(busEvent, "event");
        if (busEvent == BusEvent.CLIENT_BEHAVIOR && t != null) {
            JSONObject jSONObject = (JSONObject) t;
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "jsonPayload.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = this.f27472b.opt(next);
                if (opt != null) {
                    Object obj = jSONObject.get(next);
                    Intrinsics.checkNotNullExpressionValue(next, "key");
                    Intrinsics.checkNotNullExpressionValue(obj, "valueFromPayload");
                    if (mo20963i(next, obj, opt)) {
                    }
                }
                this.f27472b.put(next, jSONObject.get(next));
            }
        }
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f27471a);
    }

    public ClientModel(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "jsonString");
        this.f27471a = str;
        this.f27472b = new JSONObject(this.f27471a);
        this.f27473c = "client";
        this.f27474d = "behaviour";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClientModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28819e.f70617a : str);
    }
}
