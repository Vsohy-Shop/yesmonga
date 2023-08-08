package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SlotItem extends GeneratedMessageLite<SlotItem, C13129b> implements C14060o0 {
    /* access modifiers changed from: private */
    public static final SlotItem DEFAULT_INSTANCE;
    public static final int ENDDATE_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISAVAILABLE_FIELD_NUMBER = 5;
    public static final int ISGREENSLOT_FIELD_NUMBER = 9;
    private static volatile C34504y1<SlotItem> PARSER = null;
    public static final int SLICE_FIELD_NUMBER = 6;
    public static final int STARTDATE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int YIELDFEEPRICE_FIELD_NUMBER = 7;
    public static final int YIELDFEETOKEN_FIELD_NUMBER = 8;
    private String endDate_ = "";
    private String id_ = "";
    private boolean isAvailable_;
    private boolean isGreenSlot_;
    private String slice_ = "";
    private String startDate_ = "";
    private String status_ = "";
    private double yieldFeePrice_;
    private String yieldFeeToken_ = "";

    /* renamed from: com.carrefour.fid.android.SlotItem$a */
    public static /* synthetic */ class C13128a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32253a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32253a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32253a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32253a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32253a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32253a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32253a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32253a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.SlotItem.C13128a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.SlotItem$b */
    public static final class C13129b extends GeneratedMessageLite.C34263b<SlotItem, C13129b> implements C14060o0 {
        /* renamed from: P */
        public C13129b mo30873P() {
            mo100457F();
            ((SlotItem) this.f83053b).clearEndDate();
            return this;
        }

        /* renamed from: R */
        public C13129b mo30874R() {
            mo100457F();
            ((SlotItem) this.f83053b).clearId();
            return this;
        }

        /* renamed from: S */
        public C13129b mo30875S() {
            mo100457F();
            ((SlotItem) this.f83053b).clearIsAvailable();
            return this;
        }

        /* renamed from: T */
        public C13129b mo30876T() {
            mo100457F();
            ((SlotItem) this.f83053b).clearIsGreenSlot();
            return this;
        }

        /* renamed from: U */
        public C13129b mo30877U() {
            mo100457F();
            ((SlotItem) this.f83053b).clearSlice();
            return this;
        }

        /* renamed from: V */
        public C13129b mo30878V() {
            mo100457F();
            ((SlotItem) this.f83053b).clearStartDate();
            return this;
        }

        /* renamed from: Y */
        public C13129b mo30879Y() {
            mo100457F();
            ((SlotItem) this.f83053b).clearStatus();
            return this;
        }

        /* renamed from: Z */
        public C13129b mo30880Z() {
            mo100457F();
            ((SlotItem) this.f83053b).clearYieldFeePrice();
            return this;
        }

        /* renamed from: a0 */
        public C13129b mo30881a0() {
            mo100457F();
            ((SlotItem) this.f83053b).clearYieldFeeToken();
            return this;
        }

        /* renamed from: b0 */
        public C13129b mo30882b0(String str) {
            mo100457F();
            ((SlotItem) this.f83053b).setEndDate(str);
            return this;
        }

        /* renamed from: c0 */
        public C13129b mo30883c0(ByteString byteString) {
            mo100457F();
            ((SlotItem) this.f83053b).setEndDateBytes(byteString);
            return this;
        }

        /* renamed from: d0 */
        public C13129b mo30884d0(String str) {
            mo100457F();
            ((SlotItem) this.f83053b).setId(str);
            return this;
        }

        /* renamed from: g0 */
        public C13129b mo30885g0(ByteString byteString) {
            mo100457F();
            ((SlotItem) this.f83053b).setIdBytes(byteString);
            return this;
        }

        public String getEndDate() {
            return ((SlotItem) this.f83053b).getEndDate();
        }

        public ByteString getEndDateBytes() {
            return ((SlotItem) this.f83053b).getEndDateBytes();
        }

        public String getId() {
            return ((SlotItem) this.f83053b).getId();
        }

        public ByteString getIdBytes() {
            return ((SlotItem) this.f83053b).getIdBytes();
        }

        public boolean getIsAvailable() {
            return ((SlotItem) this.f83053b).getIsAvailable();
        }

        public boolean getIsGreenSlot() {
            return ((SlotItem) this.f83053b).getIsGreenSlot();
        }

        public String getSlice() {
            return ((SlotItem) this.f83053b).getSlice();
        }

        public ByteString getSliceBytes() {
            return ((SlotItem) this.f83053b).getSliceBytes();
        }

        public String getStartDate() {
            return ((SlotItem) this.f83053b).getStartDate();
        }

        public ByteString getStartDateBytes() {
            return ((SlotItem) this.f83053b).getStartDateBytes();
        }

        public String getStatus() {
            return ((SlotItem) this.f83053b).getStatus();
        }

        public ByteString getStatusBytes() {
            return ((SlotItem) this.f83053b).getStatusBytes();
        }

        public double getYieldFeePrice() {
            return ((SlotItem) this.f83053b).getYieldFeePrice();
        }

        public String getYieldFeeToken() {
            return ((SlotItem) this.f83053b).getYieldFeeToken();
        }

        public ByteString getYieldFeeTokenBytes() {
            return ((SlotItem) this.f83053b).getYieldFeeTokenBytes();
        }

        /* renamed from: h0 */
        public C13129b mo30886h0(boolean z) {
            mo100457F();
            ((SlotItem) this.f83053b).setIsAvailable(z);
            return this;
        }

        /* renamed from: i0 */
        public C13129b mo30887i0(boolean z) {
            mo100457F();
            ((SlotItem) this.f83053b).setIsGreenSlot(z);
            return this;
        }

        /* renamed from: j0 */
        public C13129b mo30888j0(String str) {
            mo100457F();
            ((SlotItem) this.f83053b).setSlice(str);
            return this;
        }

        /* renamed from: k0 */
        public C13129b mo30889k0(ByteString byteString) {
            mo100457F();
            ((SlotItem) this.f83053b).setSliceBytes(byteString);
            return this;
        }

        /* renamed from: l0 */
        public C13129b mo30890l0(String str) {
            mo100457F();
            ((SlotItem) this.f83053b).setStartDate(str);
            return this;
        }

        /* renamed from: m0 */
        public C13129b mo30891m0(ByteString byteString) {
            mo100457F();
            ((SlotItem) this.f83053b).setStartDateBytes(byteString);
            return this;
        }

        /* renamed from: o0 */
        public C13129b mo30892o0(String str) {
            mo100457F();
            ((SlotItem) this.f83053b).setStatus(str);
            return this;
        }

        /* renamed from: q0 */
        public C13129b mo30893q0(ByteString byteString) {
            mo100457F();
            ((SlotItem) this.f83053b).setStatusBytes(byteString);
            return this;
        }

        /* renamed from: r0 */
        public C13129b mo30894r0(double d) {
            mo100457F();
            ((SlotItem) this.f83053b).setYieldFeePrice(d);
            return this;
        }

        /* renamed from: s0 */
        public C13129b mo30895s0(String str) {
            mo100457F();
            ((SlotItem) this.f83053b).setYieldFeeToken(str);
            return this;
        }

        /* renamed from: u0 */
        public C13129b mo30896u0(ByteString byteString) {
            mo100457F();
            ((SlotItem) this.f83053b).setYieldFeeTokenBytes(byteString);
            return this;
        }

        public C13129b() {
            super(SlotItem.DEFAULT_INSTANCE);
        }
    }

    static {
        SlotItem slotItem = new SlotItem();
        DEFAULT_INSTANCE = slotItem;
        GeneratedMessageLite.registerDefaultInstance(SlotItem.class, slotItem);
    }

    private SlotItem() {
    }

    /* access modifiers changed from: private */
    public void clearEndDate() {
        this.endDate_ = getDefaultInstance().getEndDate();
    }

    /* access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* access modifiers changed from: private */
    public void clearIsAvailable() {
        this.isAvailable_ = false;
    }

    /* access modifiers changed from: private */
    public void clearIsGreenSlot() {
        this.isGreenSlot_ = false;
    }

    /* access modifiers changed from: private */
    public void clearSlice() {
        this.slice_ = getDefaultInstance().getSlice();
    }

    /* access modifiers changed from: private */
    public void clearStartDate() {
        this.startDate_ = getDefaultInstance().getStartDate();
    }

    /* access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = getDefaultInstance().getStatus();
    }

    /* access modifiers changed from: private */
    public void clearYieldFeePrice() {
        this.yieldFeePrice_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearYieldFeeToken() {
        this.yieldFeeToken_ = getDefaultInstance().getYieldFeeToken();
    }

    public static SlotItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13129b newBuilder() {
        return (C13129b) DEFAULT_INSTANCE.createBuilder();
    }

    public static SlotItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SlotItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SlotItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<SlotItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setEndDate(String str) {
        str.getClass();
        this.endDate_ = str;
    }

    /* access modifiers changed from: private */
    public void setEndDateBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.endDate_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setIsAvailable(boolean z) {
        this.isAvailable_ = z;
    }

    /* access modifiers changed from: private */
    public void setIsGreenSlot(boolean z) {
        this.isGreenSlot_ = z;
    }

    /* access modifiers changed from: private */
    public void setSlice(String str) {
        str.getClass();
        this.slice_ = str;
    }

    /* access modifiers changed from: private */
    public void setSliceBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.slice_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setStartDate(String str) {
        str.getClass();
        this.startDate_ = str;
    }

    /* access modifiers changed from: private */
    public void setStartDateBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.startDate_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setStatus(String str) {
        str.getClass();
        this.status_ = str;
    }

    /* access modifiers changed from: private */
    public void setStatusBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.status_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setYieldFeePrice(double d) {
        this.yieldFeePrice_ = d;
    }

    /* access modifiers changed from: private */
    public void setYieldFeeToken(String str) {
        str.getClass();
        this.yieldFeeToken_ = str;
    }

    /* access modifiers changed from: private */
    public void setYieldFeeTokenBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.yieldFeeToken_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13128a.f32253a[methodToInvoke.ordinal()]) {
            case 1:
                return new SlotItem();
            case 2:
                return new C13129b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006Ȉ\u0007\u0000\bȈ\t\u0007", new Object[]{"id_", "startDate_", "endDate_", "status_", "isAvailable_", "slice_", "yieldFeePrice_", "yieldFeeToken_", "isGreenSlot_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<SlotItem> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (SlotItem.class) {
                        y1Var = PARSER;
                        if (y1Var == null) {
                            y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                            PARSER = y1Var;
                        }
                    }
                }
                return y1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getEndDate() {
        return this.endDate_;
    }

    public ByteString getEndDateBytes() {
        return ByteString.m137260e0(this.endDate_);
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.m137260e0(this.id_);
    }

    public boolean getIsAvailable() {
        return this.isAvailable_;
    }

    public boolean getIsGreenSlot() {
        return this.isGreenSlot_;
    }

    public String getSlice() {
        return this.slice_;
    }

    public ByteString getSliceBytes() {
        return ByteString.m137260e0(this.slice_);
    }

    public String getStartDate() {
        return this.startDate_;
    }

    public ByteString getStartDateBytes() {
        return ByteString.m137260e0(this.startDate_);
    }

    public String getStatus() {
        return this.status_;
    }

    public ByteString getStatusBytes() {
        return ByteString.m137260e0(this.status_);
    }

    public double getYieldFeePrice() {
        return this.yieldFeePrice_;
    }

    public String getYieldFeeToken() {
        return this.yieldFeeToken_;
    }

    public ByteString getYieldFeeTokenBytes() {
        return ByteString.m137260e0(this.yieldFeeToken_);
    }

    public static C13129b newBuilder(SlotItem slotItem) {
        return (C13129b) DEFAULT_INSTANCE.createBuilder(slotItem);
    }

    public static SlotItem parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (SlotItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static SlotItem parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static SlotItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SlotItem parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static SlotItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SlotItem parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static SlotItem parseFrom(InputStream inputStream) throws IOException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SlotItem parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static SlotItem parseFrom(C34448s sVar) throws IOException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static SlotItem parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (SlotItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
