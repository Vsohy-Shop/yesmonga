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

public final class MemoItem extends GeneratedMessageLite<MemoItem, C13124b> implements C13979f0 {
    public static final int CREATIONDATE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final MemoItem DEFAULT_INSTANCE;
    public static final int ITEMID_FIELD_NUMBER = 1;
    public static final int ITEMTYPE_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile C34504y1<MemoItem> PARSER;
    private String creationDate_ = "";
    private String itemId_ = "";
    private String itemType_ = "";
    private String label_ = "";

    /* renamed from: com.carrefour.fid.android.MemoItem$a */
    public static /* synthetic */ class C13123a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32242a;

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
                f32242a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32242a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32242a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32242a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32242a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32242a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32242a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.MemoItem.C13123a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.MemoItem$b */
    public static final class C13124b extends GeneratedMessageLite.C34263b<MemoItem, C13124b> implements C13979f0 {
        /* renamed from: P */
        public C13124b mo30816P() {
            mo100457F();
            ((MemoItem) this.f83053b).clearCreationDate();
            return this;
        }

        /* renamed from: R */
        public C13124b mo30817R() {
            mo100457F();
            ((MemoItem) this.f83053b).clearItemId();
            return this;
        }

        /* renamed from: S */
        public C13124b mo30818S() {
            mo100457F();
            ((MemoItem) this.f83053b).clearItemType();
            return this;
        }

        /* renamed from: T */
        public C13124b mo30819T() {
            mo100457F();
            ((MemoItem) this.f83053b).clearLabel();
            return this;
        }

        /* renamed from: U */
        public C13124b mo30820U(String str) {
            mo100457F();
            ((MemoItem) this.f83053b).setCreationDate(str);
            return this;
        }

        /* renamed from: V */
        public C13124b mo30821V(ByteString byteString) {
            mo100457F();
            ((MemoItem) this.f83053b).setCreationDateBytes(byteString);
            return this;
        }

        /* renamed from: Y */
        public C13124b mo30822Y(String str) {
            mo100457F();
            ((MemoItem) this.f83053b).setItemId(str);
            return this;
        }

        /* renamed from: Z */
        public C13124b mo30823Z(ByteString byteString) {
            mo100457F();
            ((MemoItem) this.f83053b).setItemIdBytes(byteString);
            return this;
        }

        /* renamed from: a0 */
        public C13124b mo30824a0(String str) {
            mo100457F();
            ((MemoItem) this.f83053b).setItemType(str);
            return this;
        }

        /* renamed from: b0 */
        public C13124b mo30825b0(ByteString byteString) {
            mo100457F();
            ((MemoItem) this.f83053b).setItemTypeBytes(byteString);
            return this;
        }

        /* renamed from: c0 */
        public C13124b mo30826c0(String str) {
            mo100457F();
            ((MemoItem) this.f83053b).setLabel(str);
            return this;
        }

        /* renamed from: d0 */
        public C13124b mo30827d0(ByteString byteString) {
            mo100457F();
            ((MemoItem) this.f83053b).setLabelBytes(byteString);
            return this;
        }

        public String getCreationDate() {
            return ((MemoItem) this.f83053b).getCreationDate();
        }

        public ByteString getCreationDateBytes() {
            return ((MemoItem) this.f83053b).getCreationDateBytes();
        }

        public String getItemId() {
            return ((MemoItem) this.f83053b).getItemId();
        }

        public ByteString getItemIdBytes() {
            return ((MemoItem) this.f83053b).getItemIdBytes();
        }

        public String getItemType() {
            return ((MemoItem) this.f83053b).getItemType();
        }

        public ByteString getItemTypeBytes() {
            return ((MemoItem) this.f83053b).getItemTypeBytes();
        }

        public String getLabel() {
            return ((MemoItem) this.f83053b).getLabel();
        }

        public ByteString getLabelBytes() {
            return ((MemoItem) this.f83053b).getLabelBytes();
        }

        public C13124b() {
            super(MemoItem.DEFAULT_INSTANCE);
        }
    }

    static {
        MemoItem memoItem = new MemoItem();
        DEFAULT_INSTANCE = memoItem;
        GeneratedMessageLite.registerDefaultInstance(MemoItem.class, memoItem);
    }

    private MemoItem() {
    }

    /* access modifiers changed from: private */
    public void clearCreationDate() {
        this.creationDate_ = getDefaultInstance().getCreationDate();
    }

    /* access modifiers changed from: private */
    public void clearItemId() {
        this.itemId_ = getDefaultInstance().getItemId();
    }

    /* access modifiers changed from: private */
    public void clearItemType() {
        this.itemType_ = getDefaultInstance().getItemType();
    }

    /* access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    public static MemoItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13124b newBuilder() {
        return (C13124b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MemoItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MemoItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MemoItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<MemoItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCreationDate(String str) {
        str.getClass();
        this.creationDate_ = str;
    }

    /* access modifiers changed from: private */
    public void setCreationDateBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.creationDate_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setItemId(String str) {
        str.getClass();
        this.itemId_ = str;
    }

    /* access modifiers changed from: private */
    public void setItemIdBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.itemId_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setItemType(String str) {
        str.getClass();
        this.itemType_ = str;
    }

    /* access modifiers changed from: private */
    public void setItemTypeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.itemType_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* access modifiers changed from: private */
    public void setLabelBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13123a.f32242a[methodToInvoke.ordinal()]) {
            case 1:
                return new MemoItem();
            case 2:
                return new C13124b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"itemId_", "itemType_", "label_", "creationDate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<MemoItem> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (MemoItem.class) {
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

    public String getCreationDate() {
        return this.creationDate_;
    }

    public ByteString getCreationDateBytes() {
        return ByteString.m137260e0(this.creationDate_);
    }

    public String getItemId() {
        return this.itemId_;
    }

    public ByteString getItemIdBytes() {
        return ByteString.m137260e0(this.itemId_);
    }

    public String getItemType() {
        return this.itemType_;
    }

    public ByteString getItemTypeBytes() {
        return ByteString.m137260e0(this.itemType_);
    }

    public String getLabel() {
        return this.label_;
    }

    public ByteString getLabelBytes() {
        return ByteString.m137260e0(this.label_);
    }

    public static C13124b newBuilder(MemoItem memoItem) {
        return (C13124b) DEFAULT_INSTANCE.createBuilder(memoItem);
    }

    public static MemoItem parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MemoItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MemoItem parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static MemoItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MemoItem parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static MemoItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MemoItem parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static MemoItem parseFrom(InputStream inputStream) throws IOException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MemoItem parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MemoItem parseFrom(C34448s sVar) throws IOException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static MemoItem parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (MemoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
