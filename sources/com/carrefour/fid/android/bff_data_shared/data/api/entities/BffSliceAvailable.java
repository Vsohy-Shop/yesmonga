package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 [2\u00020\u0001:\u0002\\[BÇ\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bU\u0010VBÛ\u0001\b\u0017\u0012\u0006\u0010W\u001a\u00020/\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\b\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bU\u0010ZJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000bJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJÐ\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b+\u0010,J\t\u0010.\u001a\u00020-HÖ\u0001J\t\u00100\u001a\u00020/HÖ\u0001J\u0013\u00102\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u000bR\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u000bR\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u00103\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010\u000bR\"\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\u000bR\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00103\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010\u000bR\"\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u00103\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u000bR\"\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00103\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010\u000bR\"\u0010\"\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u00103\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010\u000bR\"\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u00103\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010\u000bR\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u00103\u0012\u0004\bH\u00106\u001a\u0004\bG\u0010\u000bR\"\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u00103\u0012\u0004\bJ\u00106\u001a\u0004\bI\u0010\u000bR\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u00103\u0012\u0004\bL\u00106\u001a\u0004\bK\u0010\u000bR\"\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u00103\u0012\u0004\bN\u00106\u001a\u0004\bM\u0010\u000bR\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u00103\u0012\u0004\bP\u00106\u001a\u0004\bO\u0010\u000bR\"\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u00103\u0012\u0004\bR\u00106\u001a\u0004\bQ\u0010\u000bR\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u00103\u0012\u0004\bT\u00106\u001a\u0004\bS\u0010\u000b¨\u0006]"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSliceAvailable;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "_3B", "_4A", "_4B", "_5A", "_5B", "_6A", "_6B", "_7A", "_7B", "_8A", "_8B", "_1B", "_2B", "_2A", "_1A", "_3A", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSliceAvailable;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "get_3B", "get_3B$annotations", "()V", "get_4A", "get_4A$annotations", "get_4B", "get_4B$annotations", "get_5A", "get_5A$annotations", "get_5B", "get_5B$annotations", "get_6A", "get_6A$annotations", "get_6B", "get_6B$annotations", "get_7A", "get_7A$annotations", "get_7B", "get_7B$annotations", "get_8A", "get_8A$annotations", "get_8B", "get_8B$annotations", "get_1B", "get_1B$annotations", "get_2B", "get_2B$annotations", "get_2A", "get_2A$annotations", "get_1A", "get_1A$annotations", "get_3A", "get_3A$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffSliceAvailable {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Boolean _1A;
    @C12580l
    private final Boolean _1B;
    @C12580l
    private final Boolean _2A;
    @C12580l
    private final Boolean _2B;
    @C12580l
    private final Boolean _3A;
    @C12580l
    private final Boolean _3B;
    @C12580l
    private final Boolean _4A;
    @C12580l
    private final Boolean _4B;
    @C12580l
    private final Boolean _5A;
    @C12580l
    private final Boolean _5B;
    @C12580l
    private final Boolean _6A;
    @C12580l
    private final Boolean _6B;
    @C12580l
    private final Boolean _7A;
    @C12580l
    private final Boolean _7B;
    @C12580l
    private final Boolean _8A;
    @C12580l
    private final Boolean _8B;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSliceAvailable$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSliceAvailable;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffSliceAvailable> serializer() {
            return BffSliceAvailable$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffSliceAvailable() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 65535, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffSliceAvailable copy$default(BffSliceAvailable bffSliceAvailable, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, int i, Object obj) {
        BffSliceAvailable bffSliceAvailable2 = bffSliceAvailable;
        int i2 = i;
        return bffSliceAvailable.copy((i2 & 1) != 0 ? bffSliceAvailable2._3B : bool, (i2 & 2) != 0 ? bffSliceAvailable2._4A : bool2, (i2 & 4) != 0 ? bffSliceAvailable2._4B : bool3, (i2 & 8) != 0 ? bffSliceAvailable2._5A : bool4, (i2 & 16) != 0 ? bffSliceAvailable2._5B : bool5, (i2 & 32) != 0 ? bffSliceAvailable2._6A : bool6, (i2 & 64) != 0 ? bffSliceAvailable2._6B : bool7, (i2 & 128) != 0 ? bffSliceAvailable2._7A : bool8, (i2 & 256) != 0 ? bffSliceAvailable2._7B : bool9, (i2 & 512) != 0 ? bffSliceAvailable2._8A : bool10, (i2 & 1024) != 0 ? bffSliceAvailable2._8B : bool11, (i2 & 2048) != 0 ? bffSliceAvailable2._1B : bool12, (i2 & 4096) != 0 ? bffSliceAvailable2._2B : bool13, (i2 & 8192) != 0 ? bffSliceAvailable2._2A : bool14, (i2 & 16384) != 0 ? bffSliceAvailable2._1A : bool15, (i2 & 32768) != 0 ? bffSliceAvailable2._3A : bool16);
    }

    @C12438n("1A")
    public static /* synthetic */ void get_1A$annotations() {
    }

    @C12438n("1B")
    public static /* synthetic */ void get_1B$annotations() {
    }

    @C12438n("2A")
    public static /* synthetic */ void get_2A$annotations() {
    }

    @C12438n("2B")
    public static /* synthetic */ void get_2B$annotations() {
    }

    @C12438n("3A")
    public static /* synthetic */ void get_3A$annotations() {
    }

    @C12438n("3B")
    public static /* synthetic */ void get_3B$annotations() {
    }

    @C12438n("4A")
    public static /* synthetic */ void get_4A$annotations() {
    }

    @C12438n("4B")
    public static /* synthetic */ void get_4B$annotations() {
    }

    @C12438n("5A")
    public static /* synthetic */ void get_5A$annotations() {
    }

    @C12438n("5B")
    public static /* synthetic */ void get_5B$annotations() {
    }

    @C12438n("6A")
    public static /* synthetic */ void get_6A$annotations() {
    }

    @C12438n("6B")
    public static /* synthetic */ void get_6B$annotations() {
    }

    @C12438n("7A")
    public static /* synthetic */ void get_7A$annotations() {
    }

    @C12438n("7B")
    public static /* synthetic */ void get_7B$annotations() {
    }

    @C12438n("8A")
    public static /* synthetic */ void get_8A$annotations() {
    }

    @C12438n("8B")
    public static /* synthetic */ void get_8B$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffSliceAvailable bffSliceAvailable, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffSliceAvailable._3B != null) {
            dVar.mo24912i(fVar, 0, C12278i.f30070a, bffSliceAvailable._3B);
        }
        if (dVar.mo24897A(fVar, 1) || bffSliceAvailable._4A != null) {
            dVar.mo24912i(fVar, 1, C12278i.f30070a, bffSliceAvailable._4A);
        }
        if (dVar.mo24897A(fVar, 2) || bffSliceAvailable._4B != null) {
            dVar.mo24912i(fVar, 2, C12278i.f30070a, bffSliceAvailable._4B);
        }
        if (dVar.mo24897A(fVar, 3) || bffSliceAvailable._5A != null) {
            dVar.mo24912i(fVar, 3, C12278i.f30070a, bffSliceAvailable._5A);
        }
        if (dVar.mo24897A(fVar, 4) || bffSliceAvailable._5B != null) {
            dVar.mo24912i(fVar, 4, C12278i.f30070a, bffSliceAvailable._5B);
        }
        if (dVar.mo24897A(fVar, 5) || bffSliceAvailable._6A != null) {
            dVar.mo24912i(fVar, 5, C12278i.f30070a, bffSliceAvailable._6A);
        }
        if (dVar.mo24897A(fVar, 6) || bffSliceAvailable._6B != null) {
            dVar.mo24912i(fVar, 6, C12278i.f30070a, bffSliceAvailable._6B);
        }
        if (dVar.mo24897A(fVar, 7) || bffSliceAvailable._7A != null) {
            dVar.mo24912i(fVar, 7, C12278i.f30070a, bffSliceAvailable._7A);
        }
        if (dVar.mo24897A(fVar, 8) || bffSliceAvailable._7B != null) {
            dVar.mo24912i(fVar, 8, C12278i.f30070a, bffSliceAvailable._7B);
        }
        if (dVar.mo24897A(fVar, 9) || bffSliceAvailable._8A != null) {
            dVar.mo24912i(fVar, 9, C12278i.f30070a, bffSliceAvailable._8A);
        }
        if (dVar.mo24897A(fVar, 10) || bffSliceAvailable._8B != null) {
            dVar.mo24912i(fVar, 10, C12278i.f30070a, bffSliceAvailable._8B);
        }
        if (dVar.mo24897A(fVar, 11) || bffSliceAvailable._1B != null) {
            dVar.mo24912i(fVar, 11, C12278i.f30070a, bffSliceAvailable._1B);
        }
        if (dVar.mo24897A(fVar, 12) || bffSliceAvailable._2B != null) {
            dVar.mo24912i(fVar, 12, C12278i.f30070a, bffSliceAvailable._2B);
        }
        if (dVar.mo24897A(fVar, 13) || bffSliceAvailable._2A != null) {
            dVar.mo24912i(fVar, 13, C12278i.f30070a, bffSliceAvailable._2A);
        }
        if (dVar.mo24897A(fVar, 14) || bffSliceAvailable._1A != null) {
            dVar.mo24912i(fVar, 14, C12278i.f30070a, bffSliceAvailable._1A);
        }
        if (dVar.mo24897A(fVar, 15) || bffSliceAvailable._3A != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 15, C12278i.f30070a, bffSliceAvailable._3A);
        }
    }

    @C12580l
    public final Boolean component1() {
        return this._3B;
    }

    @C12580l
    public final Boolean component10() {
        return this._8A;
    }

    @C12580l
    public final Boolean component11() {
        return this._8B;
    }

    @C12580l
    public final Boolean component12() {
        return this._1B;
    }

    @C12580l
    public final Boolean component13() {
        return this._2B;
    }

    @C12580l
    public final Boolean component14() {
        return this._2A;
    }

    @C12580l
    public final Boolean component15() {
        return this._1A;
    }

    @C12580l
    public final Boolean component16() {
        return this._3A;
    }

    @C12580l
    public final Boolean component2() {
        return this._4A;
    }

    @C12580l
    public final Boolean component3() {
        return this._4B;
    }

    @C12580l
    public final Boolean component4() {
        return this._5A;
    }

    @C12580l
    public final Boolean component5() {
        return this._5B;
    }

    @C12580l
    public final Boolean component6() {
        return this._6A;
    }

    @C12580l
    public final Boolean component7() {
        return this._6B;
    }

    @C12580l
    public final Boolean component8() {
        return this._7A;
    }

    @C12580l
    public final Boolean component9() {
        return this._7B;
    }

    @C12579k
    public final BffSliceAvailable copy(@C12580l Boolean bool, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l Boolean bool5, @C12580l Boolean bool6, @C12580l Boolean bool7, @C12580l Boolean bool8, @C12580l Boolean bool9, @C12580l Boolean bool10, @C12580l Boolean bool11, @C12580l Boolean bool12, @C12580l Boolean bool13, @C12580l Boolean bool14, @C12580l Boolean bool15, @C12580l Boolean bool16) {
        return new BffSliceAvailable(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffSliceAvailable)) {
            return false;
        }
        BffSliceAvailable bffSliceAvailable = (BffSliceAvailable) obj;
        return Intrinsics.areEqual((Object) this._3B, (Object) bffSliceAvailable._3B) && Intrinsics.areEqual((Object) this._4A, (Object) bffSliceAvailable._4A) && Intrinsics.areEqual((Object) this._4B, (Object) bffSliceAvailable._4B) && Intrinsics.areEqual((Object) this._5A, (Object) bffSliceAvailable._5A) && Intrinsics.areEqual((Object) this._5B, (Object) bffSliceAvailable._5B) && Intrinsics.areEqual((Object) this._6A, (Object) bffSliceAvailable._6A) && Intrinsics.areEqual((Object) this._6B, (Object) bffSliceAvailable._6B) && Intrinsics.areEqual((Object) this._7A, (Object) bffSliceAvailable._7A) && Intrinsics.areEqual((Object) this._7B, (Object) bffSliceAvailable._7B) && Intrinsics.areEqual((Object) this._8A, (Object) bffSliceAvailable._8A) && Intrinsics.areEqual((Object) this._8B, (Object) bffSliceAvailable._8B) && Intrinsics.areEqual((Object) this._1B, (Object) bffSliceAvailable._1B) && Intrinsics.areEqual((Object) this._2B, (Object) bffSliceAvailable._2B) && Intrinsics.areEqual((Object) this._2A, (Object) bffSliceAvailable._2A) && Intrinsics.areEqual((Object) this._1A, (Object) bffSliceAvailable._1A) && Intrinsics.areEqual((Object) this._3A, (Object) bffSliceAvailable._3A);
    }

    @C12580l
    public final Boolean get_1A() {
        return this._1A;
    }

    @C12580l
    public final Boolean get_1B() {
        return this._1B;
    }

    @C12580l
    public final Boolean get_2A() {
        return this._2A;
    }

    @C12580l
    public final Boolean get_2B() {
        return this._2B;
    }

    @C12580l
    public final Boolean get_3A() {
        return this._3A;
    }

    @C12580l
    public final Boolean get_3B() {
        return this._3B;
    }

    @C12580l
    public final Boolean get_4A() {
        return this._4A;
    }

    @C12580l
    public final Boolean get_4B() {
        return this._4B;
    }

    @C12580l
    public final Boolean get_5A() {
        return this._5A;
    }

    @C12580l
    public final Boolean get_5B() {
        return this._5B;
    }

    @C12580l
    public final Boolean get_6A() {
        return this._6A;
    }

    @C12580l
    public final Boolean get_6B() {
        return this._6B;
    }

    @C12580l
    public final Boolean get_7A() {
        return this._7A;
    }

    @C12580l
    public final Boolean get_7B() {
        return this._7B;
    }

    @C12580l
    public final Boolean get_8A() {
        return this._8A;
    }

    @C12580l
    public final Boolean get_8B() {
        return this._8B;
    }

    public int hashCode() {
        Boolean bool = this._3B;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this._4A;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this._4B;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this._5A;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this._5B;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this._6A;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this._6B;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this._7A;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this._7B;
        int hashCode9 = (hashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this._8A;
        int hashCode10 = (hashCode9 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this._8B;
        int hashCode11 = (hashCode10 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this._1B;
        int hashCode12 = (hashCode11 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this._2B;
        int hashCode13 = (hashCode12 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this._2A;
        int hashCode14 = (hashCode13 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this._1A;
        int hashCode15 = (hashCode14 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this._3A;
        if (bool16 != null) {
            i = bool16.hashCode();
        }
        return hashCode15 + i;
    }

    @C12579k
    public String toString() {
        Boolean bool = this._3B;
        Boolean bool2 = this._4A;
        Boolean bool3 = this._4B;
        Boolean bool4 = this._5A;
        Boolean bool5 = this._5B;
        Boolean bool6 = this._6A;
        Boolean bool7 = this._6B;
        Boolean bool8 = this._7A;
        Boolean bool9 = this._7B;
        Boolean bool10 = this._8A;
        Boolean bool11 = this._8B;
        Boolean bool12 = this._1B;
        Boolean bool13 = this._2B;
        Boolean bool14 = this._2A;
        Boolean bool15 = this._1A;
        Boolean bool16 = this._3A;
        return "BffSliceAvailable(_3B=" + bool + ", _4A=" + bool2 + ", _4B=" + bool3 + ", _5A=" + bool4 + ", _5B=" + bool5 + ", _6A=" + bool6 + ", _6B=" + bool7 + ", _7A=" + bool8 + ", _7B=" + bool9 + ", _8A=" + bool10 + ", _8B=" + bool11 + ", _1B=" + bool12 + ", _2B=" + bool13 + ", _2A=" + bool14 + ", _1A=" + bool15 + ", _3A=" + bool16 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffSliceAvailable(int i, @C12438n("3B") Boolean bool, @C12438n("4A") Boolean bool2, @C12438n("4B") Boolean bool3, @C12438n("5A") Boolean bool4, @C12438n("5B") Boolean bool5, @C12438n("6A") Boolean bool6, @C12438n("6B") Boolean bool7, @C12438n("7A") Boolean bool8, @C12438n("7B") Boolean bool9, @C12438n("8A") Boolean bool10, @C12438n("8B") Boolean bool11, @C12438n("1B") Boolean bool12, @C12438n("2B") Boolean bool13, @C12438n("2A") Boolean bool14, @C12438n("1A") Boolean bool15, @C12438n("3A") Boolean bool16, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffSliceAvailable$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this._3B = null;
        } else {
            this._3B = bool;
        }
        if ((i2 & 2) == 0) {
            this._4A = null;
        } else {
            this._4A = bool2;
        }
        if ((i2 & 4) == 0) {
            this._4B = null;
        } else {
            this._4B = bool3;
        }
        if ((i2 & 8) == 0) {
            this._5A = null;
        } else {
            this._5A = bool4;
        }
        if ((i2 & 16) == 0) {
            this._5B = null;
        } else {
            this._5B = bool5;
        }
        if ((i2 & 32) == 0) {
            this._6A = null;
        } else {
            this._6A = bool6;
        }
        if ((i2 & 64) == 0) {
            this._6B = null;
        } else {
            this._6B = bool7;
        }
        if ((i2 & 128) == 0) {
            this._7A = null;
        } else {
            this._7A = bool8;
        }
        if ((i2 & 256) == 0) {
            this._7B = null;
        } else {
            this._7B = bool9;
        }
        if ((i2 & 512) == 0) {
            this._8A = null;
        } else {
            this._8A = bool10;
        }
        if ((i2 & 1024) == 0) {
            this._8B = null;
        } else {
            this._8B = bool11;
        }
        if ((i2 & 2048) == 0) {
            this._1B = null;
        } else {
            this._1B = bool12;
        }
        if ((i2 & 4096) == 0) {
            this._2B = null;
        } else {
            this._2B = bool13;
        }
        if ((i2 & 8192) == 0) {
            this._2A = null;
        } else {
            this._2A = bool14;
        }
        if ((i2 & 16384) == 0) {
            this._1A = null;
        } else {
            this._1A = bool15;
        }
        if ((i2 & 32768) == 0) {
            this._3A = null;
        } else {
            this._3A = bool16;
        }
    }

    public BffSliceAvailable(@C12580l Boolean bool, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l Boolean bool5, @C12580l Boolean bool6, @C12580l Boolean bool7, @C12580l Boolean bool8, @C12580l Boolean bool9, @C12580l Boolean bool10, @C12580l Boolean bool11, @C12580l Boolean bool12, @C12580l Boolean bool13, @C12580l Boolean bool14, @C12580l Boolean bool15, @C12580l Boolean bool16) {
        this._3B = bool;
        this._4A = bool2;
        this._4B = bool3;
        this._5A = bool4;
        this._5B = bool5;
        this._6A = bool6;
        this._6B = bool7;
        this._7A = bool8;
        this._7B = bool9;
        this._8A = bool10;
        this._8B = bool11;
        this._1B = bool12;
        this._2B = bool13;
        this._2A = bool14;
        this._1A = bool15;
        this._3A = bool16;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffSliceAvailable(java.lang.Boolean r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Boolean r21, java.lang.Boolean r22, java.lang.Boolean r23, java.lang.Boolean r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, java.lang.Boolean r29, java.lang.Boolean r30, java.lang.Boolean r31, java.lang.Boolean r32, java.lang.Boolean r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r18
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r19
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r20
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r21
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r22
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r23
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r24
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r25
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r26
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r27
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r28
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r29
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r30
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r31
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r32
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0085
        L_0x0083:
            r0 = r33
        L_0x0085:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r2
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSliceAvailable.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
