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

public final class CatalogProductPicto extends GeneratedMessageLite<CatalogProductPicto, C13120b> implements C13980g {
    /* access modifiers changed from: private */
    public static final CatalogProductPicto DEFAULT_INSTANCE;
    private static volatile C34504y1<CatalogProductPicto> PARSER = null;
    public static final int PICTOID_FIELD_NUMBER = 1;
    public static final int PICTOURL_FIELD_NUMBER = 2;
    private String pictoID_ = "";
    private String pictoURL_ = "";

    /* renamed from: com.carrefour.fid.android.CatalogProductPicto$a */
    public static /* synthetic */ class C13119a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32240a;

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
                f32240a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32240a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32240a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32240a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32240a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32240a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32240a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.CatalogProductPicto.C13119a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.CatalogProductPicto$b */
    public static final class C13120b extends GeneratedMessageLite.C34263b<CatalogProductPicto, C13120b> implements C13980g {
        /* renamed from: P */
        public C13120b mo30788P() {
            mo100457F();
            ((CatalogProductPicto) this.f83053b).clearPictoID();
            return this;
        }

        /* renamed from: R */
        public C13120b mo30789R() {
            mo100457F();
            ((CatalogProductPicto) this.f83053b).clearPictoURL();
            return this;
        }

        /* renamed from: S */
        public C13120b mo30790S(String str) {
            mo100457F();
            ((CatalogProductPicto) this.f83053b).setPictoID(str);
            return this;
        }

        /* renamed from: T */
        public C13120b mo30791T(ByteString byteString) {
            mo100457F();
            ((CatalogProductPicto) this.f83053b).setPictoIDBytes(byteString);
            return this;
        }

        /* renamed from: U */
        public C13120b mo30792U(String str) {
            mo100457F();
            ((CatalogProductPicto) this.f83053b).setPictoURL(str);
            return this;
        }

        /* renamed from: V */
        public C13120b mo30793V(ByteString byteString) {
            mo100457F();
            ((CatalogProductPicto) this.f83053b).setPictoURLBytes(byteString);
            return this;
        }

        public String getPictoID() {
            return ((CatalogProductPicto) this.f83053b).getPictoID();
        }

        public ByteString getPictoIDBytes() {
            return ((CatalogProductPicto) this.f83053b).getPictoIDBytes();
        }

        public String getPictoURL() {
            return ((CatalogProductPicto) this.f83053b).getPictoURL();
        }

        public ByteString getPictoURLBytes() {
            return ((CatalogProductPicto) this.f83053b).getPictoURLBytes();
        }

        public C13120b() {
            super(CatalogProductPicto.DEFAULT_INSTANCE);
        }
    }

    static {
        CatalogProductPicto catalogProductPicto = new CatalogProductPicto();
        DEFAULT_INSTANCE = catalogProductPicto;
        GeneratedMessageLite.registerDefaultInstance(CatalogProductPicto.class, catalogProductPicto);
    }

    private CatalogProductPicto() {
    }

    /* access modifiers changed from: private */
    public void clearPictoID() {
        this.pictoID_ = getDefaultInstance().getPictoID();
    }

    /* access modifiers changed from: private */
    public void clearPictoURL() {
        this.pictoURL_ = getDefaultInstance().getPictoURL();
    }

    public static CatalogProductPicto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13120b newBuilder() {
        return (C13120b) DEFAULT_INSTANCE.createBuilder();
    }

    public static CatalogProductPicto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CatalogProductPicto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CatalogProductPicto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<CatalogProductPicto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setPictoID(String str) {
        str.getClass();
        this.pictoID_ = str;
    }

    /* access modifiers changed from: private */
    public void setPictoIDBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.pictoID_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPictoURL(String str) {
        str.getClass();
        this.pictoURL_ = str;
    }

    /* access modifiers changed from: private */
    public void setPictoURLBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.pictoURL_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13119a.f32240a[methodToInvoke.ordinal()]) {
            case 1:
                return new CatalogProductPicto();
            case 2:
                return new C13120b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"pictoID_", "pictoURL_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<CatalogProductPicto> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (CatalogProductPicto.class) {
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

    public String getPictoID() {
        return this.pictoID_;
    }

    public ByteString getPictoIDBytes() {
        return ByteString.m137260e0(this.pictoID_);
    }

    public String getPictoURL() {
        return this.pictoURL_;
    }

    public ByteString getPictoURLBytes() {
        return ByteString.m137260e0(this.pictoURL_);
    }

    public static C13120b newBuilder(CatalogProductPicto catalogProductPicto) {
        return (C13120b) DEFAULT_INSTANCE.createBuilder(catalogProductPicto);
    }

    public static CatalogProductPicto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (CatalogProductPicto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static CatalogProductPicto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static CatalogProductPicto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CatalogProductPicto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static CatalogProductPicto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CatalogProductPicto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static CatalogProductPicto parseFrom(InputStream inputStream) throws IOException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CatalogProductPicto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static CatalogProductPicto parseFrom(C34448s sVar) throws IOException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static CatalogProductPicto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (CatalogProductPicto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
