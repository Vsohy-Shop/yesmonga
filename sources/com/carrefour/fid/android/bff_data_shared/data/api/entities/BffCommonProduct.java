package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.runtime.C8698y1;
import com.urbanairship.util.C9647e0;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12311t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 î\u00022\u00020\u0001:\u0006ï\u0002ð\u0002î\u0002BÑ\u0007\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u0011\b\u0002\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000100\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000102\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000104\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000106\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000108\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000108\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010;\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010=\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010?\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010A\u0012\u0011\b\u0002\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010-\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u001d\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010¢\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010£\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010¤\u0001\u001a\u0004\u0018\u00010\u0010\u0012\u000b\b\u0002\u0010¥\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010¦\u0001\u001a\u0004\u0018\u00010\u001d\u0012\u0011\b\u0002\u0010§\u0001\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010-\u0012\u000b\b\u0002\u0010¨\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010©\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010ª\u0001\u001a\u0004\u0018\u00010\t\u0012\u000b\b\u0002\u0010«\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010¬\u0001\u001a\u0004\u0018\u00010\u0010\u0012\u000b\b\u0002\u0010­\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0002\u0010®\u0001\u001a\u0004\u0018\u00010\f\u0012\u0011\b\u0002\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-\u0012\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010d\u0012\u0011\b\u0002\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010-¢\u0006\u0006\bæ\u0002\u0010ç\u0002Bú\u0007\b\u0017\u0012\u0007\u0010è\u0002\u001a\u00020\u001d\u0012\u0007\u0010é\u0002\u001a\u00020\u001d\u0012\u0007\u0010ê\u0002\u001a\u00020\u001d\u0012\n\b\u0001\u0010h\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010l\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010m\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010n\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010o\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010s\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010v\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010x\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010y\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010z\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010{\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010|\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010}\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010~\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u0011\b\u0001\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u000100\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u000102\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u000104\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u000106\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u000108\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u000108\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010;\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010=\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010?\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010A\u0012\u0011\b\u0001\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010-\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u001d\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010 \u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010¡\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010¢\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010£\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010¤\u0001\u001a\u0004\u0018\u00010\u0010\u0012\u000b\b\u0001\u0010¥\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010¦\u0001\u001a\u0004\u0018\u00010\u001d\u0012\u0011\b\u0001\u0010§\u0001\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010-\u0012\u000b\b\u0001\u0010¨\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010©\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010ª\u0001\u001a\u0004\u0018\u00010\t\u0012\u000b\b\u0001\u0010«\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010¬\u0001\u001a\u0004\u0018\u00010\u0010\u0012\u000b\b\u0001\u0010­\u0001\u001a\u0004\u0018\u00010\f\u0012\u000b\b\u0001\u0010®\u0001\u001a\u0004\u0018\u00010\f\u0012\u0011\b\u0001\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-\u0012\u000b\b\u0001\u0010°\u0001\u001a\u0004\u0018\u00010d\u0012\u0011\b\u0001\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010-\u0012\n\u0010ì\u0002\u001a\u0005\u0018\u00010ë\u0002¢\u0006\u0006\bæ\u0002\u0010í\u0002J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u000100HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u000102HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u000104HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u000106HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u000108HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u000108HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010;HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010=HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010?HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010AHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010-HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010L\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bL\u0010\u001fJ\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010W\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bW\u0010\u0012J\u000b\u0010X\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010Y\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bY\u0010\u001fJ\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010-HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010^\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b^\u0010\u000bJ\u000b\u0010_\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010`\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b`\u0010\u0012J\u000b\u0010a\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010dHÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010-HÆ\u0003JÛ\u0007\u0010²\u0001\u001a\u00020\u00002\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u0011\b\u0002\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u0001002\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u0001022\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u0001042\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u0001062\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u0001082\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u0001082\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010;2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010=2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010?2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010A2\u0011\b\u0002\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010-2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u001d2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010¢\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010£\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010¤\u0001\u001a\u0004\u0018\u00010\u00102\u000b\b\u0002\u0010¥\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010¦\u0001\u001a\u0004\u0018\u00010\u001d2\u0011\b\u0002\u0010§\u0001\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010-2\u000b\b\u0002\u0010¨\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010©\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010ª\u0001\u001a\u0004\u0018\u00010\t2\u000b\b\u0002\u0010«\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010¬\u0001\u001a\u0004\u0018\u00010\u00102\u000b\b\u0002\u0010­\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010®\u0001\u001a\u0004\u0018\u00010\f2\u0011\b\u0002\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-2\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010d2\u0011\b\u0002\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010-HÆ\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\n\u0010´\u0001\u001a\u00020\fHÖ\u0001J\n\u0010µ\u0001\u001a\u00020\u001dHÖ\u0001J\u0015\u0010·\u0001\u001a\u00020\u00102\t\u0010¶\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010h\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0016\n\u0005\bh\u0010¸\u0001\u0012\u0006\bº\u0001\u0010»\u0001\u001a\u0005\b¹\u0001\u0010\u000bR'\u0010i\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bi\u0010¼\u0001\u0012\u0006\b¿\u0001\u0010»\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R'\u0010j\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bj\u0010¼\u0001\u0012\u0006\bÁ\u0001\u0010»\u0001\u001a\u0006\bÀ\u0001\u0010¾\u0001R'\u0010k\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bk\u0010¼\u0001\u0012\u0006\bÃ\u0001\u0010»\u0001\u001a\u0006\bÂ\u0001\u0010¾\u0001R%\u0010l\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0015\n\u0005\bl\u0010Ä\u0001\u0012\u0006\bÅ\u0001\u0010»\u0001\u001a\u0004\bl\u0010\u0012R&\u0010m\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0016\n\u0005\bm\u0010Ä\u0001\u0012\u0006\bÇ\u0001\u0010»\u0001\u001a\u0005\bÆ\u0001\u0010\u0012R&\u0010n\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0016\n\u0005\bn\u0010Ä\u0001\u0012\u0006\bÉ\u0001\u0010»\u0001\u001a\u0005\bÈ\u0001\u0010\u0012R'\u0010o\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bo\u0010¼\u0001\u0012\u0006\bË\u0001\u0010»\u0001\u001a\u0006\bÊ\u0001\u0010¾\u0001R'\u0010p\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bp\u0010¼\u0001\u0012\u0006\bÍ\u0001\u0010»\u0001\u001a\u0006\bÌ\u0001\u0010¾\u0001R'\u0010q\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bq\u0010¼\u0001\u0012\u0006\bÏ\u0001\u0010»\u0001\u001a\u0006\bÎ\u0001\u0010¾\u0001R'\u0010r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\br\u0010¼\u0001\u0012\u0006\bÑ\u0001\u0010»\u0001\u001a\u0006\bÐ\u0001\u0010¾\u0001R'\u0010s\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bs\u0010¼\u0001\u0012\u0006\bÓ\u0001\u0010»\u0001\u001a\u0006\bÒ\u0001\u0010¾\u0001R'\u0010t\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bt\u0010¼\u0001\u0012\u0006\bÕ\u0001\u0010»\u0001\u001a\u0006\bÔ\u0001\u0010¾\u0001R'\u0010u\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bu\u0010¼\u0001\u0012\u0006\b×\u0001\u0010»\u0001\u001a\u0006\bÖ\u0001\u0010¾\u0001R'\u0010v\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bv\u0010¼\u0001\u0012\u0006\bÙ\u0001\u0010»\u0001\u001a\u0006\bØ\u0001\u0010¾\u0001R&\u0010w\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0016\n\u0005\bw\u0010Ú\u0001\u0012\u0006\bÜ\u0001\u0010»\u0001\u001a\u0005\bÛ\u0001\u0010\u001fR&\u0010x\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0016\n\u0005\bx\u0010Ú\u0001\u0012\u0006\bÞ\u0001\u0010»\u0001\u001a\u0005\bÝ\u0001\u0010\u001fR'\u0010y\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\by\u0010¼\u0001\u0012\u0006\bà\u0001\u0010»\u0001\u001a\u0006\bß\u0001\u0010¾\u0001R'\u0010z\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\bz\u0010¼\u0001\u0012\u0006\bâ\u0001\u0010»\u0001\u001a\u0006\bá\u0001\u0010¾\u0001R'\u0010{\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\b{\u0010¼\u0001\u0012\u0006\bä\u0001\u0010»\u0001\u001a\u0006\bã\u0001\u0010¾\u0001R'\u0010|\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\b|\u0010¼\u0001\u0012\u0006\bæ\u0001\u0010»\u0001\u001a\u0006\bå\u0001\u0010¾\u0001R'\u0010}\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\b}\u0010¼\u0001\u0012\u0006\bè\u0001\u0010»\u0001\u001a\u0006\bç\u0001\u0010¾\u0001R'\u0010~\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\b~\u0010¼\u0001\u0012\u0006\bê\u0001\u0010»\u0001\u001a\u0006\bé\u0001\u0010¾\u0001R'\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0017\n\u0005\b\u0010¼\u0001\u0012\u0006\bì\u0001\u0010»\u0001\u001a\u0006\bë\u0001\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bî\u0001\u0010»\u0001\u001a\u0006\bí\u0001\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bð\u0001\u0010»\u0001\u001a\u0006\bï\u0001\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bò\u0001\u0010»\u0001\u001a\u0006\bñ\u0001\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bô\u0001\u0010»\u0001\u001a\u0006\bó\u0001\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bö\u0001\u0010»\u0001\u001a\u0006\bõ\u0001\u0010¾\u0001R/\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010÷\u0001\u0012\u0006\bú\u0001\u0010»\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bü\u0001\u0010»\u0001\u001a\u0006\bû\u0001\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u0001008\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010ý\u0001\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001R)\u0010\u0001\u001a\u0004\u0018\u0001028\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u0001048\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u0001068\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u0001088\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u0001088\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u00010;8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u00010=8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u00010?8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b\u0002\u0010»\u0001\u001a\u0006\b\u0002\u0010\u0002R)\u0010\u0001\u001a\u0004\u0018\u00010A8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u0012\u0006\b¢\u0002\u0010»\u0001\u001a\u0006\b \u0002\u0010¡\u0002R/\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010-8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010÷\u0001\u0012\u0006\b¤\u0002\u0010»\u0001\u001a\u0006\b£\u0002\u0010ù\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b¦\u0002\u0010»\u0001\u001a\u0006\b¥\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b¨\u0002\u0010»\u0001\u001a\u0006\b§\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bª\u0002\u0010»\u0001\u001a\u0006\b©\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b¬\u0002\u0010»\u0001\u001a\u0006\b«\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b®\u0002\u0010»\u0001\u001a\u0006\b­\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b°\u0002\u0010»\u0001\u001a\u0006\b¯\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b²\u0002\u0010»\u0001\u001a\u0006\b±\u0002\u0010¾\u0001R(\u0010\u0001\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010Ú\u0001\u0012\u0006\b´\u0002\u0010»\u0001\u001a\u0005\b³\u0002\u0010\u001fR)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b¶\u0002\u0010»\u0001\u001a\u0006\bµ\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b¸\u0002\u0010»\u0001\u001a\u0006\b·\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bº\u0002\u0010»\u0001\u001a\u0006\b¹\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b¼\u0002\u0010»\u0001\u001a\u0006\b»\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\b¾\u0002\u0010»\u0001\u001a\u0006\b½\u0002\u0010¾\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010¼\u0001\u0012\u0006\bÀ\u0002\u0010»\u0001\u001a\u0006\b¿\u0002\u0010¾\u0001R)\u0010 \u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b \u0001\u0010¼\u0001\u0012\u0006\bÂ\u0002\u0010»\u0001\u001a\u0006\bÁ\u0002\u0010¾\u0001R)\u0010¡\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b¡\u0001\u0010¼\u0001\u0012\u0006\bÄ\u0002\u0010»\u0001\u001a\u0006\bÃ\u0002\u0010¾\u0001R)\u0010¢\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b¢\u0001\u0010¼\u0001\u0012\u0006\bÆ\u0002\u0010»\u0001\u001a\u0006\bÅ\u0002\u0010¾\u0001R)\u0010£\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b£\u0001\u0010¼\u0001\u0012\u0006\bÈ\u0002\u0010»\u0001\u001a\u0006\bÇ\u0002\u0010¾\u0001R(\u0010¤\u0001\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0017\n\u0006\b¤\u0001\u0010Ä\u0001\u0012\u0006\bÉ\u0002\u0010»\u0001\u001a\u0005\b¤\u0001\u0010\u0012R)\u0010¥\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b¥\u0001\u0010¼\u0001\u0012\u0006\bË\u0002\u0010»\u0001\u001a\u0006\bÊ\u0002\u0010¾\u0001R(\u0010¦\u0001\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0017\n\u0006\b¦\u0001\u0010Ú\u0001\u0012\u0006\bÍ\u0002\u0010»\u0001\u001a\u0005\bÌ\u0002\u0010\u001fR/\u0010§\u0001\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010-8\u0006X\u0004¢\u0006\u0018\n\u0006\b§\u0001\u0010÷\u0001\u0012\u0006\bÏ\u0002\u0010»\u0001\u001a\u0006\bÎ\u0002\u0010ù\u0001R)\u0010¨\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b¨\u0001\u0010¼\u0001\u0012\u0006\bÑ\u0002\u0010»\u0001\u001a\u0006\bÐ\u0002\u0010¾\u0001R)\u0010©\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b©\u0001\u0010¼\u0001\u0012\u0006\bÓ\u0002\u0010»\u0001\u001a\u0006\bÒ\u0002\u0010¾\u0001R(\u0010ª\u0001\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0006\bª\u0001\u0010¸\u0001\u0012\u0006\bÕ\u0002\u0010»\u0001\u001a\u0005\bÔ\u0002\u0010\u000bR)\u0010«\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b«\u0001\u0010¼\u0001\u0012\u0006\b×\u0002\u0010»\u0001\u001a\u0006\bÖ\u0002\u0010¾\u0001R(\u0010¬\u0001\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0017\n\u0006\b¬\u0001\u0010Ä\u0001\u0012\u0006\bÙ\u0002\u0010»\u0001\u001a\u0005\bØ\u0002\u0010\u0012R)\u0010­\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b­\u0001\u0010¼\u0001\u0012\u0006\bÛ\u0002\u0010»\u0001\u001a\u0006\bÚ\u0002\u0010¾\u0001R)\u0010®\u0001\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0018\n\u0006\b®\u0001\u0010¼\u0001\u0012\u0006\bÝ\u0002\u0010»\u0001\u001a\u0006\bÜ\u0002\u0010¾\u0001R/\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010-8\u0006X\u0004¢\u0006\u0018\n\u0006\b¯\u0001\u0010÷\u0001\u0012\u0006\bß\u0002\u0010»\u0001\u001a\u0006\bÞ\u0002\u0010ù\u0001R)\u0010°\u0001\u001a\u0004\u0018\u00010d8\u0006X\u0004¢\u0006\u0018\n\u0006\b°\u0001\u0010à\u0002\u0012\u0006\bã\u0002\u0010»\u0001\u001a\u0006\bá\u0002\u0010â\u0002R/\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010-8\u0006X\u0004¢\u0006\u0018\n\u0006\b±\u0001\u0010÷\u0001\u0012\u0006\bå\u0002\u0010»\u0001\u001a\u0006\bä\u0002\u0010ù\u0001¨\u0006ñ\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Double;", "", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "", "component16", "()Ljava/lang/Integer;", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "", "component30", "component31", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;", "component32", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductFlags;", "component33", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;", "component34", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMarketingSalesUnit;", "component35", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;", "component36", "component37", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;", "component38", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;", "component39", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;", "component40", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalAttribute;", "component41", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFoodAttributes;", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;", "component73", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;", "component74", "score", "gtin", "cdbase", "name", "isMatchedColor", "containAlcohol", "containCafein", "longName", "nature", "qualifier", "subBrandName", "packaging", "brandName", "regulatedName", "keywordsConcatenated", "minMaxPrepVariableWeight", "profitSortIndex", "sortGroup", "mainInformation", "warningAdvices", "consumerAdvice", "storageMode", "serviceCenterContact", "flavor", "productBenefits", "consumerBenefits", "advertisedInformations", "consumerAge", "healthClaims", "standardizedHealthClaims", "primaryLinkNode", "pictures", "flags", "weightsAndMeasures", "marketingSalesUnit", "minimumAge", "maximumAge", "food", "nonFood", "technicalAttributes", "additionalAttributes", "categories", "source", "sourceCode", "articleShortTitle", "articleLongTitle", "articleShortDescription", "longDescription", "label", "brandLogoId", "productFormat", "facetLabels", "status", "brandDescription", "hyperBcp", "qrCodeUrl", "dosage", "aocName", "informationFlagFormat", "taxeMessage", "isVariableWeight", "productType", "warranty", "nonFoodAttributes", "fullDescription", "keyFeatures", "repairIndex", "repairIndexUrl", "bffIsFood", "bffDisplayBrand", "bffDisplayName", "bffDeliveryModes", "bffRepairIndexTemplate", "offers", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductFlags;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMarketingSalesUnit;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalAttribute;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "toString", "hashCode", "other", "equals", "Ljava/lang/Double;", "getScore", "getScore$annotations", "()V", "Ljava/lang/String;", "getGtin", "()Ljava/lang/String;", "getGtin$annotations", "getCdbase", "getCdbase$annotations", "getName", "getName$annotations", "Ljava/lang/Boolean;", "isMatchedColor$annotations", "getContainAlcohol", "getContainAlcohol$annotations", "getContainCafein", "getContainCafein$annotations", "getLongName", "getLongName$annotations", "getNature", "getNature$annotations", "getQualifier", "getQualifier$annotations", "getSubBrandName", "getSubBrandName$annotations", "getPackaging", "getPackaging$annotations", "getBrandName", "getBrandName$annotations", "getRegulatedName", "getRegulatedName$annotations", "getKeywordsConcatenated", "getKeywordsConcatenated$annotations", "Ljava/lang/Integer;", "getMinMaxPrepVariableWeight", "getMinMaxPrepVariableWeight$annotations", "getProfitSortIndex", "getProfitSortIndex$annotations", "getSortGroup", "getSortGroup$annotations", "getMainInformation", "getMainInformation$annotations", "getWarningAdvices", "getWarningAdvices$annotations", "getConsumerAdvice", "getConsumerAdvice$annotations", "getStorageMode", "getStorageMode$annotations", "getServiceCenterContact", "getServiceCenterContact$annotations", "getFlavor", "getFlavor$annotations", "getProductBenefits", "getProductBenefits$annotations", "getConsumerBenefits", "getConsumerBenefits$annotations", "getAdvertisedInformations", "getAdvertisedInformations$annotations", "getConsumerAge", "getConsumerAge$annotations", "getHealthClaims", "getHealthClaims$annotations", "Ljava/util/List;", "getStandardizedHealthClaims", "()Ljava/util/List;", "getStandardizedHealthClaims$annotations", "getPrimaryLinkNode", "getPrimaryLinkNode$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;", "getPictures", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;", "getPictures$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductFlags;", "getFlags", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductFlags;", "getFlags$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;", "getWeightsAndMeasures", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;", "getWeightsAndMeasures$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMarketingSalesUnit;", "getMarketingSalesUnit", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMarketingSalesUnit;", "getMarketingSalesUnit$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;", "getMinimumAge", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;", "getMinimumAge$annotations", "getMaximumAge", "getMaximumAge$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;", "getFood", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;", "getFood$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;", "getNonFood", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;", "getNonFood$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;", "getTechnicalAttributes", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;", "getTechnicalAttributes$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalAttribute;", "getAdditionalAttributes", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalAttribute;", "getAdditionalAttributes$annotations", "getCategories", "getCategories$annotations", "getSource", "getSource$annotations", "getSourceCode", "getSourceCode$annotations", "getArticleShortTitle", "getArticleShortTitle$annotations", "getArticleLongTitle", "getArticleLongTitle$annotations", "getArticleShortDescription", "getArticleShortDescription$annotations", "getLongDescription", "getLongDescription$annotations", "getLabel", "getLabel$annotations", "getBrandLogoId", "getBrandLogoId$annotations", "getProductFormat", "getProductFormat$annotations", "getFacetLabels", "getFacetLabels$annotations", "getStatus", "getStatus$annotations", "getBrandDescription", "getBrandDescription$annotations", "getHyperBcp", "getHyperBcp$annotations", "getQrCodeUrl", "getQrCodeUrl$annotations", "getDosage", "getDosage$annotations", "getAocName", "getAocName$annotations", "getInformationFlagFormat", "getInformationFlagFormat$annotations", "getTaxeMessage", "getTaxeMessage$annotations", "isVariableWeight$annotations", "getProductType", "getProductType$annotations", "getWarranty", "getWarranty$annotations", "getNonFoodAttributes", "getNonFoodAttributes$annotations", "getFullDescription", "getFullDescription$annotations", "getKeyFeatures", "getKeyFeatures$annotations", "getRepairIndex", "getRepairIndex$annotations", "getRepairIndexUrl", "getRepairIndexUrl$annotations", "getBffIsFood", "getBffIsFood$annotations", "getBffDisplayBrand", "getBffDisplayBrand$annotations", "getBffDisplayName", "getBffDisplayName$annotations", "getBffDeliveryModes", "getBffDeliveryModes$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;", "getBffRepairIndexTemplate", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;", "getBffRepairIndexTemplate$annotations", "getOffers", "getOffers$annotations", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductFlags;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMarketingSalesUnit;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalAttribute;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;Ljava/util/List;)V", "seen1", "seen2", "seen3", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IIILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductFlags;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMarketingSalesUnit;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMinimumAge;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalAttribute;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "BffRepairIndexTemplate", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCommonProduct {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffAdditionalAttribute additionalAttributes;
    @C12580l
    private final String advertisedInformations;
    @C12580l
    private final String aocName;
    @C12580l
    private final String articleLongTitle;
    @C12580l
    private final String articleShortDescription;
    @C12580l
    private final String articleShortTitle;
    @C12580l
    private final List<String> bffDeliveryModes;
    @C12580l
    private final String bffDisplayBrand;
    @C12580l
    private final String bffDisplayName;
    @C12580l
    private final Boolean bffIsFood;
    @C12580l
    private final BffRepairIndexTemplate bffRepairIndexTemplate;
    @C12580l
    private final String brandDescription;
    @C12580l
    private final Integer brandLogoId;
    @C12580l
    private final String brandName;
    @C12580l
    private final List<BffCommonCategory> categories;
    @C12580l
    private final String cdbase;
    @C12580l
    private final String consumerAdvice;
    @C12580l
    private final String consumerAge;
    @C12580l
    private final String consumerBenefits;
    @C12580l
    private final Boolean containAlcohol;
    @C12580l
    private final Boolean containCafein;
    @C12580l
    private final String dosage;
    @C12580l
    private final String facetLabels;
    @C12580l
    private final BffProductFlags flags;
    @C12580l
    private final String flavor;
    @C12580l
    private final BffFood food;
    @C12580l
    private final String fullDescription;
    @C12580l
    private final String gtin;
    @C12580l
    private final String healthClaims;
    @C12580l
    private final String hyperBcp;
    @C12580l
    private final String informationFlagFormat;
    @C12580l
    private final Boolean isMatchedColor;
    @C12580l
    private final Boolean isVariableWeight;
    @C12580l
    private final String keyFeatures;
    @C12580l
    private final String keywordsConcatenated;
    @C12580l
    private final String label;
    @C12580l
    private final String longDescription;
    @C12580l
    private final String longName;
    @C12580l
    private final String mainInformation;
    @C12580l
    private final BffMarketingSalesUnit marketingSalesUnit;
    @C12580l
    private final BffMinimumAge maximumAge;
    @C12580l
    private final Integer minMaxPrepVariableWeight;
    @C12580l
    private final BffMinimumAge minimumAge;
    @C12580l
    private final String name;
    @C12580l
    private final String nature;
    @C12580l
    private final BffNonFood nonFood;
    @C12580l
    private final List<BffNonFoodAttributes> nonFoodAttributes;
    @C12580l
    private final List<BffProductOffer> offers;
    @C12580l
    private final String packaging;
    @C12580l
    private final BffPictures pictures;
    @C12580l
    private final String primaryLinkNode;
    @C12580l
    private final String productBenefits;
    @C12580l
    private final String productFormat;
    @C12580l
    private final String productType;
    @C12580l
    private final Integer profitSortIndex;
    @C12580l
    private final String qrCodeUrl;
    @C12580l
    private final String qualifier;
    @C12580l
    private final String regulatedName;
    @C12580l
    private final Double repairIndex;
    @C12580l
    private final String repairIndexUrl;
    @C12580l
    private final Double score;
    @C12580l
    private final String serviceCenterContact;
    @C12580l
    private final String sortGroup;
    @C12580l
    private final String source;
    @C12580l
    private final String sourceCode;
    @C12580l
    private final List<String> standardizedHealthClaims;
    @C12580l
    private final String status;
    @C12580l
    private final String storageMode;
    @C12580l
    private final String subBrandName;
    @C12580l
    private final String taxeMessage;
    @C12580l
    private final BffTechnicalAttribute technicalAttributes;
    @C12580l
    private final String warningAdvices;
    @C12580l
    private final Integer warranty;
    @C12580l
    private final BffWeightsAndMeasures weightsAndMeasures;

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "rED", "oRANGE", "yELLOW", "lIGHTGREEN", "dARKGREEN", "uNKNOWN", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public enum BffRepairIndexTemplate {
        rED("RED"),
        oRANGE("ORANGE"),
        yELLOW("YELLOW"),
        lIGHTGREEN("LIGHT_GREEN"),
        dARKGREEN("DARK_GREEN"),
        uNKNOWN("UNKNOWN");
        
        /* access modifiers changed from: private */
        @C12579k
        public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
        @C12579k
        public static final Companion Companion = null;
        @C12579k
        private final String value;

        @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$BffRepairIndexTemplate;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C12248g get$cachedSerializer() {
                return (C12248g) BffRepairIndexTemplate.$cachedSerializer$delegate.getValue();
            }

            @C12579k
            public final C12248g<BffRepairIndexTemplate> serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393561.INSTANCE);
        }

        private BffRepairIndexTemplate(String str) {
            this.value = str;
        }

        @C12579k
        public final String getValue() {
            return this.value;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCommonProduct> serializer() {
            return BffCommonProduct$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        $childSerializers = new C12248g[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C12269f(s1Var), null, null, null, null, null, null, null, null, null, null, null, new C12269f(BffCommonCategory$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C12269f(BffNonFoodAttributes$$serializer.INSTANCE), null, null, null, null, null, null, null, new C12269f(s1Var), null, new C12269f(BffProductOffer$$serializer.INSTANCE)};
    }

    public BffCommonProduct() {
        this((Double) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (BffPictures) null, (BffProductFlags) null, (BffWeightsAndMeasures) null, (BffMarketingSalesUnit) null, (BffMinimumAge) null, (BffMinimumAge) null, (BffFood) null, (BffNonFood) null, (BffTechnicalAttribute) null, (BffAdditionalAttribute) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (Integer) null, (List) null, (String) null, (String) null, (Double) null, (String) null, (Boolean) null, (String) null, (String) null, (List) null, (BffRepairIndexTemplate) null, (List) null, -1, -1, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCommonProduct copy$default(BffCommonProduct bffCommonProduct, Double d, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, List list, String str24, BffPictures bffPictures, BffProductFlags bffProductFlags, BffWeightsAndMeasures bffWeightsAndMeasures, BffMarketingSalesUnit bffMarketingSalesUnit, BffMinimumAge bffMinimumAge, BffMinimumAge bffMinimumAge2, BffFood bffFood, BffNonFood bffNonFood, BffTechnicalAttribute bffTechnicalAttribute, BffAdditionalAttribute bffAdditionalAttribute, List list2, String str25, String str26, String str27, String str28, String str29, String str30, String str31, Integer num3, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Boolean bool4, String str42, Integer num4, List list3, String str43, String str44, Double d2, String str45, Boolean bool5, String str46, String str47, List list4, BffRepairIndexTemplate bffRepairIndexTemplate2, List list5, int i, int i2, int i3, Object obj) {
        BffCommonProduct bffCommonProduct2 = bffCommonProduct;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        return bffCommonProduct.copy((i4 & 1) != 0 ? bffCommonProduct2.score : d, (i4 & 2) != 0 ? bffCommonProduct2.gtin : str, (i4 & 4) != 0 ? bffCommonProduct2.cdbase : str2, (i4 & 8) != 0 ? bffCommonProduct2.name : str3, (i4 & 16) != 0 ? bffCommonProduct2.isMatchedColor : bool, (i4 & 32) != 0 ? bffCommonProduct2.containAlcohol : bool2, (i4 & 64) != 0 ? bffCommonProduct2.containCafein : bool3, (i4 & 128) != 0 ? bffCommonProduct2.longName : str4, (i4 & 256) != 0 ? bffCommonProduct2.nature : str5, (i4 & 512) != 0 ? bffCommonProduct2.qualifier : str6, (i4 & 1024) != 0 ? bffCommonProduct2.subBrandName : str7, (i4 & 2048) != 0 ? bffCommonProduct2.packaging : str8, (i4 & 4096) != 0 ? bffCommonProduct2.brandName : str9, (i4 & 8192) != 0 ? bffCommonProduct2.regulatedName : str10, (i4 & 16384) != 0 ? bffCommonProduct2.keywordsConcatenated : str11, (i4 & 32768) != 0 ? bffCommonProduct2.minMaxPrepVariableWeight : num, (i4 & 65536) != 0 ? bffCommonProduct2.profitSortIndex : num2, (i4 & 131072) != 0 ? bffCommonProduct2.sortGroup : str12, (i4 & 262144) != 0 ? bffCommonProduct2.mainInformation : str13, (i4 & 524288) != 0 ? bffCommonProduct2.warningAdvices : str14, (i4 & 1048576) != 0 ? bffCommonProduct2.consumerAdvice : str15, (i4 & 2097152) != 0 ? bffCommonProduct2.storageMode : str16, (i4 & 4194304) != 0 ? bffCommonProduct2.serviceCenterContact : str17, (i4 & 8388608) != 0 ? bffCommonProduct2.flavor : str18, (i4 & 16777216) != 0 ? bffCommonProduct2.productBenefits : str19, (i4 & C9647e0.f26435a) != 0 ? bffCommonProduct2.consumerBenefits : str20, (i4 & C8698y1.f23302n) != 0 ? bffCommonProduct2.advertisedInformations : str21, (i4 & C8698y1.f23301m) != 0 ? bffCommonProduct2.consumerAge : str22, (i4 & 268435456) != 0 ? bffCommonProduct2.healthClaims : str23, (i4 & 536870912) != 0 ? bffCommonProduct2.standardizedHealthClaims : list, (i4 & 1073741824) != 0 ? bffCommonProduct2.primaryLinkNode : str24, (i4 & Integer.MIN_VALUE) != 0 ? bffCommonProduct2.pictures : bffPictures, (i5 & 1) != 0 ? bffCommonProduct2.flags : bffProductFlags, (i5 & 2) != 0 ? bffCommonProduct2.weightsAndMeasures : bffWeightsAndMeasures, (i5 & 4) != 0 ? bffCommonProduct2.marketingSalesUnit : bffMarketingSalesUnit, (i5 & 8) != 0 ? bffCommonProduct2.minimumAge : bffMinimumAge, (i5 & 16) != 0 ? bffCommonProduct2.maximumAge : bffMinimumAge2, (i5 & 32) != 0 ? bffCommonProduct2.food : bffFood, (i5 & 64) != 0 ? bffCommonProduct2.nonFood : bffNonFood, (i5 & 128) != 0 ? bffCommonProduct2.technicalAttributes : bffTechnicalAttribute, (i5 & 256) != 0 ? bffCommonProduct2.additionalAttributes : bffAdditionalAttribute, (i5 & 512) != 0 ? bffCommonProduct2.categories : list2, (i5 & 1024) != 0 ? bffCommonProduct2.source : str25, (i5 & 2048) != 0 ? bffCommonProduct2.sourceCode : str26, (i5 & 4096) != 0 ? bffCommonProduct2.articleShortTitle : str27, (i5 & 8192) != 0 ? bffCommonProduct2.articleLongTitle : str28, (i5 & 16384) != 0 ? bffCommonProduct2.articleShortDescription : str29, (i5 & 32768) != 0 ? bffCommonProduct2.longDescription : str30, (i5 & 65536) != 0 ? bffCommonProduct2.label : str31, (i5 & 131072) != 0 ? bffCommonProduct2.brandLogoId : num3, (i5 & 262144) != 0 ? bffCommonProduct2.productFormat : str32, (i5 & 524288) != 0 ? bffCommonProduct2.facetLabels : str33, (i5 & 1048576) != 0 ? bffCommonProduct2.status : str34, (i5 & 2097152) != 0 ? bffCommonProduct2.brandDescription : str35, (i5 & 4194304) != 0 ? bffCommonProduct2.hyperBcp : str36, (i5 & 8388608) != 0 ? bffCommonProduct2.qrCodeUrl : str37, (i5 & 16777216) != 0 ? bffCommonProduct2.dosage : str38, (i5 & C9647e0.f26435a) != 0 ? bffCommonProduct2.aocName : str39, (i5 & C8698y1.f23302n) != 0 ? bffCommonProduct2.informationFlagFormat : str40, (i5 & C8698y1.f23301m) != 0 ? bffCommonProduct2.taxeMessage : str41, (i5 & 268435456) != 0 ? bffCommonProduct2.isVariableWeight : bool4, (i5 & 536870912) != 0 ? bffCommonProduct2.productType : str42, (i5 & 1073741824) != 0 ? bffCommonProduct2.warranty : num4, (i5 & Integer.MIN_VALUE) != 0 ? bffCommonProduct2.nonFoodAttributes : list3, (i6 & 1) != 0 ? bffCommonProduct2.fullDescription : str43, (i6 & 2) != 0 ? bffCommonProduct2.keyFeatures : str44, (i6 & 4) != 0 ? bffCommonProduct2.repairIndex : d2, (i6 & 8) != 0 ? bffCommonProduct2.repairIndexUrl : str45, (i6 & 16) != 0 ? bffCommonProduct2.bffIsFood : bool5, (i6 & 32) != 0 ? bffCommonProduct2.bffDisplayBrand : str46, (i6 & 64) != 0 ? bffCommonProduct2.bffDisplayName : str47, (i6 & 128) != 0 ? bffCommonProduct2.bffDeliveryModes : list4, (i6 & 256) != 0 ? bffCommonProduct2.bffRepairIndexTemplate : bffRepairIndexTemplate2, (i6 & 512) != 0 ? bffCommonProduct2.offers : list5);
    }

    @C12438n("additional_attributes")
    public static /* synthetic */ void getAdditionalAttributes$annotations() {
    }

    @C12438n("advertised_informations")
    public static /* synthetic */ void getAdvertisedInformations$annotations() {
    }

    @C12438n("aoc_name")
    public static /* synthetic */ void getAocName$annotations() {
    }

    @C12438n("article_long_title")
    public static /* synthetic */ void getArticleLongTitle$annotations() {
    }

    @C12438n("article_short_description")
    public static /* synthetic */ void getArticleShortDescription$annotations() {
    }

    @C12438n("article_short_title")
    public static /* synthetic */ void getArticleShortTitle$annotations() {
    }

    @C12438n("bff_delivery_modes")
    public static /* synthetic */ void getBffDeliveryModes$annotations() {
    }

    @C12438n("bff_display_brand")
    public static /* synthetic */ void getBffDisplayBrand$annotations() {
    }

    @C12438n("bff_display_name")
    public static /* synthetic */ void getBffDisplayName$annotations() {
    }

    @C12438n("bff_is_food")
    public static /* synthetic */ void getBffIsFood$annotations() {
    }

    @C12438n("bff_repair_index_template")
    public static /* synthetic */ void getBffRepairIndexTemplate$annotations() {
    }

    @C12438n("brand_description")
    public static /* synthetic */ void getBrandDescription$annotations() {
    }

    @C12438n("brand_logo_id")
    public static /* synthetic */ void getBrandLogoId$annotations() {
    }

    @C12438n("brand_name")
    public static /* synthetic */ void getBrandName$annotations() {
    }

    @C12438n("categories")
    public static /* synthetic */ void getCategories$annotations() {
    }

    @C12438n("cdbase")
    public static /* synthetic */ void getCdbase$annotations() {
    }

    @C12438n("consumer_advice")
    public static /* synthetic */ void getConsumerAdvice$annotations() {
    }

    @C12438n("consumer_age")
    public static /* synthetic */ void getConsumerAge$annotations() {
    }

    @C12438n("consumer_benefits")
    public static /* synthetic */ void getConsumerBenefits$annotations() {
    }

    @C12438n("contain_alcohol")
    public static /* synthetic */ void getContainAlcohol$annotations() {
    }

    @C12438n("contain_cafein")
    public static /* synthetic */ void getContainCafein$annotations() {
    }

    @C12438n("dosage")
    public static /* synthetic */ void getDosage$annotations() {
    }

    @C12438n("facet_labels")
    public static /* synthetic */ void getFacetLabels$annotations() {
    }

    @C12438n("flags")
    public static /* synthetic */ void getFlags$annotations() {
    }

    @C12438n("flavor")
    public static /* synthetic */ void getFlavor$annotations() {
    }

    @C12438n("food")
    public static /* synthetic */ void getFood$annotations() {
    }

    @C12438n("full_description")
    public static /* synthetic */ void getFullDescription$annotations() {
    }

    @C12438n("gtin")
    public static /* synthetic */ void getGtin$annotations() {
    }

    @C12438n("health_claims")
    public static /* synthetic */ void getHealthClaims$annotations() {
    }

    @C12438n("hyper_bcp")
    public static /* synthetic */ void getHyperBcp$annotations() {
    }

    @C12438n("information_flag_format")
    public static /* synthetic */ void getInformationFlagFormat$annotations() {
    }

    @C12438n("key_features")
    public static /* synthetic */ void getKeyFeatures$annotations() {
    }

    @C12438n("keywords_concatenated")
    public static /* synthetic */ void getKeywordsConcatenated$annotations() {
    }

    @C12438n("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @C12438n("long_description")
    public static /* synthetic */ void getLongDescription$annotations() {
    }

    @C12438n("long_name")
    public static /* synthetic */ void getLongName$annotations() {
    }

    @C12438n("main_information")
    public static /* synthetic */ void getMainInformation$annotations() {
    }

    @C12438n("marketing_sales_unit")
    public static /* synthetic */ void getMarketingSalesUnit$annotations() {
    }

    @C12438n("maximum_age")
    public static /* synthetic */ void getMaximumAge$annotations() {
    }

    @C12438n("min_max_prep_variable_weight")
    public static /* synthetic */ void getMinMaxPrepVariableWeight$annotations() {
    }

    @C12438n("minimum_age")
    public static /* synthetic */ void getMinimumAge$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C12438n("nature")
    public static /* synthetic */ void getNature$annotations() {
    }

    @C12438n("non_food")
    public static /* synthetic */ void getNonFood$annotations() {
    }

    @C12438n("non_food_attributes")
    public static /* synthetic */ void getNonFoodAttributes$annotations() {
    }

    @C12438n("offers")
    public static /* synthetic */ void getOffers$annotations() {
    }

    @C12438n("packaging")
    public static /* synthetic */ void getPackaging$annotations() {
    }

    @C12438n("pictures")
    public static /* synthetic */ void getPictures$annotations() {
    }

    @C12438n("primary_link_node")
    public static /* synthetic */ void getPrimaryLinkNode$annotations() {
    }

    @C12438n("product_benefits")
    public static /* synthetic */ void getProductBenefits$annotations() {
    }

    @C12438n("product_format")
    public static /* synthetic */ void getProductFormat$annotations() {
    }

    @C12438n("product_type")
    public static /* synthetic */ void getProductType$annotations() {
    }

    @C12438n("profit_sort_index")
    public static /* synthetic */ void getProfitSortIndex$annotations() {
    }

    @C12438n("qr_code_url")
    public static /* synthetic */ void getQrCodeUrl$annotations() {
    }

    @C12438n("qualifier")
    public static /* synthetic */ void getQualifier$annotations() {
    }

    @C12438n("regulated_name")
    public static /* synthetic */ void getRegulatedName$annotations() {
    }

    @C12438n("repair_index")
    public static /* synthetic */ void getRepairIndex$annotations() {
    }

    @C12438n("repair_index_url")
    public static /* synthetic */ void getRepairIndexUrl$annotations() {
    }

    @C12438n("score")
    public static /* synthetic */ void getScore$annotations() {
    }

    @C12438n("service_center_contact")
    public static /* synthetic */ void getServiceCenterContact$annotations() {
    }

    @C12438n("sort_group")
    public static /* synthetic */ void getSortGroup$annotations() {
    }

    @C12438n("source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @C12438n("source_code")
    public static /* synthetic */ void getSourceCode$annotations() {
    }

    @C12438n("standardized_health_claims")
    public static /* synthetic */ void getStandardizedHealthClaims$annotations() {
    }

    @C12438n("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @C12438n("storage_mode")
    public static /* synthetic */ void getStorageMode$annotations() {
    }

    @C12438n("sub_brand_name")
    public static /* synthetic */ void getSubBrandName$annotations() {
    }

    @C12438n("taxe_message")
    public static /* synthetic */ void getTaxeMessage$annotations() {
    }

    @C12438n("technical_attributes")
    public static /* synthetic */ void getTechnicalAttributes$annotations() {
    }

    @C12438n("warning_advices")
    public static /* synthetic */ void getWarningAdvices$annotations() {
    }

    @C12438n("warranty")
    public static /* synthetic */ void getWarranty$annotations() {
    }

    @C12438n("weights_and_measures")
    public static /* synthetic */ void getWeightsAndMeasures$annotations() {
    }

    @C12438n("is_matched_color")
    public static /* synthetic */ void isMatchedColor$annotations() {
    }

    @C12438n("is_variable_weight")
    public static /* synthetic */ void isVariableWeight$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCommonProduct bffCommonProduct, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCommonProduct.score != null) {
            dVar.mo24912i(fVar, 0, C12311t.f30119a, bffCommonProduct.score);
        }
        if (dVar.mo24897A(fVar, 1) || bffCommonProduct.gtin != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCommonProduct.gtin);
        }
        if (dVar.mo24897A(fVar, 2) || bffCommonProduct.cdbase != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffCommonProduct.cdbase);
        }
        if (dVar.mo24897A(fVar, 3) || bffCommonProduct.name != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCommonProduct.name);
        }
        if (dVar.mo24897A(fVar, 4) || bffCommonProduct.isMatchedColor != null) {
            dVar.mo24912i(fVar, 4, C12278i.f30070a, bffCommonProduct.isMatchedColor);
        }
        if (dVar.mo24897A(fVar, 5) || bffCommonProduct.containAlcohol != null) {
            dVar.mo24912i(fVar, 5, C12278i.f30070a, bffCommonProduct.containAlcohol);
        }
        if (dVar.mo24897A(fVar, 6) || bffCommonProduct.containCafein != null) {
            dVar.mo24912i(fVar, 6, C12278i.f30070a, bffCommonProduct.containCafein);
        }
        if (dVar.mo24897A(fVar, 7) || bffCommonProduct.longName != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffCommonProduct.longName);
        }
        if (dVar.mo24897A(fVar, 8) || bffCommonProduct.nature != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffCommonProduct.nature);
        }
        if (dVar.mo24897A(fVar, 9) || bffCommonProduct.qualifier != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffCommonProduct.qualifier);
        }
        if (dVar.mo24897A(fVar, 10) || bffCommonProduct.subBrandName != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffCommonProduct.subBrandName);
        }
        if (dVar.mo24897A(fVar, 11) || bffCommonProduct.packaging != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffCommonProduct.packaging);
        }
        if (dVar.mo24897A(fVar, 12) || bffCommonProduct.brandName != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffCommonProduct.brandName);
        }
        if (dVar.mo24897A(fVar, 13) || bffCommonProduct.regulatedName != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffCommonProduct.regulatedName);
        }
        if (dVar.mo24897A(fVar, 14) || bffCommonProduct.keywordsConcatenated != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffCommonProduct.keywordsConcatenated);
        }
        if (dVar.mo24897A(fVar, 15) || bffCommonProduct.minMaxPrepVariableWeight != null) {
            dVar.mo24912i(fVar, 15, C12276h0.f30067a, bffCommonProduct.minMaxPrepVariableWeight);
        }
        if (dVar.mo24897A(fVar, 16) || bffCommonProduct.profitSortIndex != null) {
            dVar.mo24912i(fVar, 16, C12276h0.f30067a, bffCommonProduct.profitSortIndex);
        }
        if (dVar.mo24897A(fVar, 17) || bffCommonProduct.sortGroup != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffCommonProduct.sortGroup);
        }
        if (dVar.mo24897A(fVar, 18) || bffCommonProduct.mainInformation != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffCommonProduct.mainInformation);
        }
        if (dVar.mo24897A(fVar, 19) || bffCommonProduct.warningAdvices != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffCommonProduct.warningAdvices);
        }
        if (dVar.mo24897A(fVar, 20) || bffCommonProduct.consumerAdvice != null) {
            dVar.mo24912i(fVar, 20, C12310s1.f30117a, bffCommonProduct.consumerAdvice);
        }
        if (dVar.mo24897A(fVar, 21) || bffCommonProduct.storageMode != null) {
            dVar.mo24912i(fVar, 21, C12310s1.f30117a, bffCommonProduct.storageMode);
        }
        if (dVar.mo24897A(fVar, 22) || bffCommonProduct.serviceCenterContact != null) {
            dVar.mo24912i(fVar, 22, C12310s1.f30117a, bffCommonProduct.serviceCenterContact);
        }
        if (dVar.mo24897A(fVar, 23) || bffCommonProduct.flavor != null) {
            dVar.mo24912i(fVar, 23, C12310s1.f30117a, bffCommonProduct.flavor);
        }
        if (dVar.mo24897A(fVar, 24) || bffCommonProduct.productBenefits != null) {
            dVar.mo24912i(fVar, 24, C12310s1.f30117a, bffCommonProduct.productBenefits);
        }
        if (dVar.mo24897A(fVar, 25) || bffCommonProduct.consumerBenefits != null) {
            dVar.mo24912i(fVar, 25, C12310s1.f30117a, bffCommonProduct.consumerBenefits);
        }
        if (dVar.mo24897A(fVar, 26) || bffCommonProduct.advertisedInformations != null) {
            dVar.mo24912i(fVar, 26, C12310s1.f30117a, bffCommonProduct.advertisedInformations);
        }
        if (dVar.mo24897A(fVar, 27) || bffCommonProduct.consumerAge != null) {
            dVar.mo24912i(fVar, 27, C12310s1.f30117a, bffCommonProduct.consumerAge);
        }
        if (dVar.mo24897A(fVar, 28) || bffCommonProduct.healthClaims != null) {
            dVar.mo24912i(fVar, 28, C12310s1.f30117a, bffCommonProduct.healthClaims);
        }
        if (dVar.mo24897A(fVar, 29) || bffCommonProduct.standardizedHealthClaims != null) {
            dVar.mo24912i(fVar, 29, gVarArr[29], bffCommonProduct.standardizedHealthClaims);
        }
        if (dVar.mo24897A(fVar, 30) || bffCommonProduct.primaryLinkNode != null) {
            dVar.mo24912i(fVar, 30, C12310s1.f30117a, bffCommonProduct.primaryLinkNode);
        }
        if (dVar.mo24897A(fVar, 31) || bffCommonProduct.pictures != null) {
            dVar.mo24912i(fVar, 31, BffPictures$$serializer.INSTANCE, bffCommonProduct.pictures);
        }
        if (dVar.mo24897A(fVar, 32) || bffCommonProduct.flags != null) {
            dVar.mo24912i(fVar, 32, BffProductFlags$$serializer.INSTANCE, bffCommonProduct.flags);
        }
        if (dVar.mo24897A(fVar, 33) || bffCommonProduct.weightsAndMeasures != null) {
            dVar.mo24912i(fVar, 33, BffWeightsAndMeasures$$serializer.INSTANCE, bffCommonProduct.weightsAndMeasures);
        }
        if (dVar.mo24897A(fVar, 34) || bffCommonProduct.marketingSalesUnit != null) {
            dVar.mo24912i(fVar, 34, BffMarketingSalesUnit$$serializer.INSTANCE, bffCommonProduct.marketingSalesUnit);
        }
        if (dVar.mo24897A(fVar, 35) || bffCommonProduct.minimumAge != null) {
            dVar.mo24912i(fVar, 35, BffMinimumAge$$serializer.INSTANCE, bffCommonProduct.minimumAge);
        }
        if (dVar.mo24897A(fVar, 36) || bffCommonProduct.maximumAge != null) {
            dVar.mo24912i(fVar, 36, BffMinimumAge$$serializer.INSTANCE, bffCommonProduct.maximumAge);
        }
        if (dVar.mo24897A(fVar, 37) || bffCommonProduct.food != null) {
            dVar.mo24912i(fVar, 37, BffFood$$serializer.INSTANCE, bffCommonProduct.food);
        }
        if (dVar.mo24897A(fVar, 38) || bffCommonProduct.nonFood != null) {
            dVar.mo24912i(fVar, 38, BffNonFood$$serializer.INSTANCE, bffCommonProduct.nonFood);
        }
        if (dVar.mo24897A(fVar, 39) || bffCommonProduct.technicalAttributes != null) {
            dVar.mo24912i(fVar, 39, BffTechnicalAttribute$$serializer.INSTANCE, bffCommonProduct.technicalAttributes);
        }
        if (dVar.mo24897A(fVar, 40) || bffCommonProduct.additionalAttributes != null) {
            dVar.mo24912i(fVar, 40, BffAdditionalAttribute$$serializer.INSTANCE, bffCommonProduct.additionalAttributes);
        }
        if (dVar.mo24897A(fVar, 41) || bffCommonProduct.categories != null) {
            dVar.mo24912i(fVar, 41, gVarArr[41], bffCommonProduct.categories);
        }
        if (dVar.mo24897A(fVar, 42) || bffCommonProduct.source != null) {
            dVar.mo24912i(fVar, 42, C12310s1.f30117a, bffCommonProduct.source);
        }
        if (dVar.mo24897A(fVar, 43) || bffCommonProduct.sourceCode != null) {
            dVar.mo24912i(fVar, 43, C12310s1.f30117a, bffCommonProduct.sourceCode);
        }
        if (dVar.mo24897A(fVar, 44) || bffCommonProduct.articleShortTitle != null) {
            dVar.mo24912i(fVar, 44, C12310s1.f30117a, bffCommonProduct.articleShortTitle);
        }
        if (dVar.mo24897A(fVar, 45) || bffCommonProduct.articleLongTitle != null) {
            dVar.mo24912i(fVar, 45, C12310s1.f30117a, bffCommonProduct.articleLongTitle);
        }
        if (dVar.mo24897A(fVar, 46) || bffCommonProduct.articleShortDescription != null) {
            dVar.mo24912i(fVar, 46, C12310s1.f30117a, bffCommonProduct.articleShortDescription);
        }
        if (dVar.mo24897A(fVar, 47) || bffCommonProduct.longDescription != null) {
            dVar.mo24912i(fVar, 47, C12310s1.f30117a, bffCommonProduct.longDescription);
        }
        if (dVar.mo24897A(fVar, 48) || bffCommonProduct.label != null) {
            dVar.mo24912i(fVar, 48, C12310s1.f30117a, bffCommonProduct.label);
        }
        if (dVar.mo24897A(fVar, 49) || bffCommonProduct.brandLogoId != null) {
            dVar.mo24912i(fVar, 49, C12276h0.f30067a, bffCommonProduct.brandLogoId);
        }
        if (dVar.mo24897A(fVar, 50) || bffCommonProduct.productFormat != null) {
            dVar.mo24912i(fVar, 50, C12310s1.f30117a, bffCommonProduct.productFormat);
        }
        if (dVar.mo24897A(fVar, 51) || bffCommonProduct.facetLabels != null) {
            dVar.mo24912i(fVar, 51, C12310s1.f30117a, bffCommonProduct.facetLabels);
        }
        if (dVar.mo24897A(fVar, 52) || bffCommonProduct.status != null) {
            dVar.mo24912i(fVar, 52, C12310s1.f30117a, bffCommonProduct.status);
        }
        if (dVar.mo24897A(fVar, 53) || bffCommonProduct.brandDescription != null) {
            dVar.mo24912i(fVar, 53, C12310s1.f30117a, bffCommonProduct.brandDescription);
        }
        if (dVar.mo24897A(fVar, 54) || bffCommonProduct.hyperBcp != null) {
            dVar.mo24912i(fVar, 54, C12310s1.f30117a, bffCommonProduct.hyperBcp);
        }
        if (dVar.mo24897A(fVar, 55) || bffCommonProduct.qrCodeUrl != null) {
            dVar.mo24912i(fVar, 55, C12310s1.f30117a, bffCommonProduct.qrCodeUrl);
        }
        if (dVar.mo24897A(fVar, 56) || bffCommonProduct.dosage != null) {
            dVar.mo24912i(fVar, 56, C12310s1.f30117a, bffCommonProduct.dosage);
        }
        if (dVar.mo24897A(fVar, 57) || bffCommonProduct.aocName != null) {
            dVar.mo24912i(fVar, 57, C12310s1.f30117a, bffCommonProduct.aocName);
        }
        if (dVar.mo24897A(fVar, 58) || bffCommonProduct.informationFlagFormat != null) {
            dVar.mo24912i(fVar, 58, C12310s1.f30117a, bffCommonProduct.informationFlagFormat);
        }
        if (dVar.mo24897A(fVar, 59) || bffCommonProduct.taxeMessage != null) {
            dVar.mo24912i(fVar, 59, C12310s1.f30117a, bffCommonProduct.taxeMessage);
        }
        if (dVar.mo24897A(fVar, 60) || bffCommonProduct.isVariableWeight != null) {
            dVar.mo24912i(fVar, 60, C12278i.f30070a, bffCommonProduct.isVariableWeight);
        }
        if (dVar.mo24897A(fVar, 61) || bffCommonProduct.productType != null) {
            dVar.mo24912i(fVar, 61, C12310s1.f30117a, bffCommonProduct.productType);
        }
        if (dVar.mo24897A(fVar, 62) || bffCommonProduct.warranty != null) {
            dVar.mo24912i(fVar, 62, C12276h0.f30067a, bffCommonProduct.warranty);
        }
        if (dVar.mo24897A(fVar, 63) || bffCommonProduct.nonFoodAttributes != null) {
            dVar.mo24912i(fVar, 63, gVarArr[63], bffCommonProduct.nonFoodAttributes);
        }
        if (dVar.mo24897A(fVar, 64) || bffCommonProduct.fullDescription != null) {
            dVar.mo24912i(fVar, 64, C12310s1.f30117a, bffCommonProduct.fullDescription);
        }
        if (dVar.mo24897A(fVar, 65) || bffCommonProduct.keyFeatures != null) {
            dVar.mo24912i(fVar, 65, C12310s1.f30117a, bffCommonProduct.keyFeatures);
        }
        if (dVar.mo24897A(fVar, 66) || bffCommonProduct.repairIndex != null) {
            dVar.mo24912i(fVar, 66, C12311t.f30119a, bffCommonProduct.repairIndex);
        }
        if (dVar.mo24897A(fVar, 67) || bffCommonProduct.repairIndexUrl != null) {
            dVar.mo24912i(fVar, 67, C12310s1.f30117a, bffCommonProduct.repairIndexUrl);
        }
        if (dVar.mo24897A(fVar, 68) || bffCommonProduct.bffIsFood != null) {
            dVar.mo24912i(fVar, 68, C12278i.f30070a, bffCommonProduct.bffIsFood);
        }
        if (dVar.mo24897A(fVar, 69) || bffCommonProduct.bffDisplayBrand != null) {
            dVar.mo24912i(fVar, 69, C12310s1.f30117a, bffCommonProduct.bffDisplayBrand);
        }
        if (dVar.mo24897A(fVar, 70) || bffCommonProduct.bffDisplayName != null) {
            dVar.mo24912i(fVar, 70, C12310s1.f30117a, bffCommonProduct.bffDisplayName);
        }
        if (dVar.mo24897A(fVar, 71) || bffCommonProduct.bffDeliveryModes != null) {
            dVar.mo24912i(fVar, 71, gVarArr[71], bffCommonProduct.bffDeliveryModes);
        }
        if (dVar.mo24897A(fVar, 72) || bffCommonProduct.bffRepairIndexTemplate != null) {
            dVar.mo24912i(fVar, 72, BffCommonProduct$BffRepairIndexTemplate$$serializer.INSTANCE, bffCommonProduct.bffRepairIndexTemplate);
        }
        if (dVar.mo24897A(fVar, 73) || bffCommonProduct.offers != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 73, gVarArr[73], bffCommonProduct.offers);
        }
    }

    @C12580l
    public final Double component1() {
        return this.score;
    }

    @C12580l
    public final String component10() {
        return this.qualifier;
    }

    @C12580l
    public final String component11() {
        return this.subBrandName;
    }

    @C12580l
    public final String component12() {
        return this.packaging;
    }

    @C12580l
    public final String component13() {
        return this.brandName;
    }

    @C12580l
    public final String component14() {
        return this.regulatedName;
    }

    @C12580l
    public final String component15() {
        return this.keywordsConcatenated;
    }

    @C12580l
    public final Integer component16() {
        return this.minMaxPrepVariableWeight;
    }

    @C12580l
    public final Integer component17() {
        return this.profitSortIndex;
    }

    @C12580l
    public final String component18() {
        return this.sortGroup;
    }

    @C12580l
    public final String component19() {
        return this.mainInformation;
    }

    @C12580l
    public final String component2() {
        return this.gtin;
    }

    @C12580l
    public final String component20() {
        return this.warningAdvices;
    }

    @C12580l
    public final String component21() {
        return this.consumerAdvice;
    }

    @C12580l
    public final String component22() {
        return this.storageMode;
    }

    @C12580l
    public final String component23() {
        return this.serviceCenterContact;
    }

    @C12580l
    public final String component24() {
        return this.flavor;
    }

    @C12580l
    public final String component25() {
        return this.productBenefits;
    }

    @C12580l
    public final String component26() {
        return this.consumerBenefits;
    }

    @C12580l
    public final String component27() {
        return this.advertisedInformations;
    }

    @C12580l
    public final String component28() {
        return this.consumerAge;
    }

    @C12580l
    public final String component29() {
        return this.healthClaims;
    }

    @C12580l
    public final String component3() {
        return this.cdbase;
    }

    @C12580l
    public final List<String> component30() {
        return this.standardizedHealthClaims;
    }

    @C12580l
    public final String component31() {
        return this.primaryLinkNode;
    }

    @C12580l
    public final BffPictures component32() {
        return this.pictures;
    }

    @C12580l
    public final BffProductFlags component33() {
        return this.flags;
    }

    @C12580l
    public final BffWeightsAndMeasures component34() {
        return this.weightsAndMeasures;
    }

    @C12580l
    public final BffMarketingSalesUnit component35() {
        return this.marketingSalesUnit;
    }

    @C12580l
    public final BffMinimumAge component36() {
        return this.minimumAge;
    }

    @C12580l
    public final BffMinimumAge component37() {
        return this.maximumAge;
    }

    @C12580l
    public final BffFood component38() {
        return this.food;
    }

    @C12580l
    public final BffNonFood component39() {
        return this.nonFood;
    }

    @C12580l
    public final String component4() {
        return this.name;
    }

    @C12580l
    public final BffTechnicalAttribute component40() {
        return this.technicalAttributes;
    }

    @C12580l
    public final BffAdditionalAttribute component41() {
        return this.additionalAttributes;
    }

    @C12580l
    public final List<BffCommonCategory> component42() {
        return this.categories;
    }

    @C12580l
    public final String component43() {
        return this.source;
    }

    @C12580l
    public final String component44() {
        return this.sourceCode;
    }

    @C12580l
    public final String component45() {
        return this.articleShortTitle;
    }

    @C12580l
    public final String component46() {
        return this.articleLongTitle;
    }

    @C12580l
    public final String component47() {
        return this.articleShortDescription;
    }

    @C12580l
    public final String component48() {
        return this.longDescription;
    }

    @C12580l
    public final String component49() {
        return this.label;
    }

    @C12580l
    public final Boolean component5() {
        return this.isMatchedColor;
    }

    @C12580l
    public final Integer component50() {
        return this.brandLogoId;
    }

    @C12580l
    public final String component51() {
        return this.productFormat;
    }

    @C12580l
    public final String component52() {
        return this.facetLabels;
    }

    @C12580l
    public final String component53() {
        return this.status;
    }

    @C12580l
    public final String component54() {
        return this.brandDescription;
    }

    @C12580l
    public final String component55() {
        return this.hyperBcp;
    }

    @C12580l
    public final String component56() {
        return this.qrCodeUrl;
    }

    @C12580l
    public final String component57() {
        return this.dosage;
    }

    @C12580l
    public final String component58() {
        return this.aocName;
    }

    @C12580l
    public final String component59() {
        return this.informationFlagFormat;
    }

    @C12580l
    public final Boolean component6() {
        return this.containAlcohol;
    }

    @C12580l
    public final String component60() {
        return this.taxeMessage;
    }

    @C12580l
    public final Boolean component61() {
        return this.isVariableWeight;
    }

    @C12580l
    public final String component62() {
        return this.productType;
    }

    @C12580l
    public final Integer component63() {
        return this.warranty;
    }

    @C12580l
    public final List<BffNonFoodAttributes> component64() {
        return this.nonFoodAttributes;
    }

    @C12580l
    public final String component65() {
        return this.fullDescription;
    }

    @C12580l
    public final String component66() {
        return this.keyFeatures;
    }

    @C12580l
    public final Double component67() {
        return this.repairIndex;
    }

    @C12580l
    public final String component68() {
        return this.repairIndexUrl;
    }

    @C12580l
    public final Boolean component69() {
        return this.bffIsFood;
    }

    @C12580l
    public final Boolean component7() {
        return this.containCafein;
    }

    @C12580l
    public final String component70() {
        return this.bffDisplayBrand;
    }

    @C12580l
    public final String component71() {
        return this.bffDisplayName;
    }

    @C12580l
    public final List<String> component72() {
        return this.bffDeliveryModes;
    }

    @C12580l
    public final BffRepairIndexTemplate component73() {
        return this.bffRepairIndexTemplate;
    }

    @C12580l
    public final List<BffProductOffer> component74() {
        return this.offers;
    }

    @C12580l
    public final String component8() {
        return this.longName;
    }

    @C12580l
    public final String component9() {
        return this.nature;
    }

    @C12579k
    public final BffCommonProduct copy(@C12580l Double d, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l Integer num, @C12580l Integer num2, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l String str22, @C12580l String str23, @C12580l List<String> list, @C12580l String str24, @C12580l BffPictures bffPictures, @C12580l BffProductFlags bffProductFlags, @C12580l BffWeightsAndMeasures bffWeightsAndMeasures, @C12580l BffMarketingSalesUnit bffMarketingSalesUnit, @C12580l BffMinimumAge bffMinimumAge, @C12580l BffMinimumAge bffMinimumAge2, @C12580l BffFood bffFood, @C12580l BffNonFood bffNonFood, @C12580l BffTechnicalAttribute bffTechnicalAttribute, @C12580l BffAdditionalAttribute bffAdditionalAttribute, @C12580l List<BffCommonCategory> list2, @C12580l String str25, @C12580l String str26, @C12580l String str27, @C12580l String str28, @C12580l String str29, @C12580l String str30, @C12580l String str31, @C12580l Integer num3, @C12580l String str32, @C12580l String str33, @C12580l String str34, @C12580l String str35, @C12580l String str36, @C12580l String str37, @C12580l String str38, @C12580l String str39, @C12580l String str40, @C12580l String str41, @C12580l Boolean bool4, @C12580l String str42, @C12580l Integer num4, @C12580l List<BffNonFoodAttributes> list3, @C12580l String str43, @C12580l String str44, @C12580l Double d2, @C12580l String str45, @C12580l Boolean bool5, @C12580l String str46, @C12580l String str47, @C12580l List<String> list4, @C12580l BffRepairIndexTemplate bffRepairIndexTemplate2, @C12580l List<BffProductOffer> list5) {
        return new BffCommonProduct(d, str, str2, str3, bool, bool2, bool3, str4, str5, str6, str7, str8, str9, str10, str11, num, num2, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, list, str24, bffPictures, bffProductFlags, bffWeightsAndMeasures, bffMarketingSalesUnit, bffMinimumAge, bffMinimumAge2, bffFood, bffNonFood, bffTechnicalAttribute, bffAdditionalAttribute, list2, str25, str26, str27, str28, str29, str30, str31, num3, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, bool4, str42, num4, list3, str43, str44, d2, str45, bool5, str46, str47, list4, bffRepairIndexTemplate2, list5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCommonProduct)) {
            return false;
        }
        BffCommonProduct bffCommonProduct = (BffCommonProduct) obj;
        return Intrinsics.areEqual((Object) this.score, (Object) bffCommonProduct.score) && Intrinsics.areEqual((Object) this.gtin, (Object) bffCommonProduct.gtin) && Intrinsics.areEqual((Object) this.cdbase, (Object) bffCommonProduct.cdbase) && Intrinsics.areEqual((Object) this.name, (Object) bffCommonProduct.name) && Intrinsics.areEqual((Object) this.isMatchedColor, (Object) bffCommonProduct.isMatchedColor) && Intrinsics.areEqual((Object) this.containAlcohol, (Object) bffCommonProduct.containAlcohol) && Intrinsics.areEqual((Object) this.containCafein, (Object) bffCommonProduct.containCafein) && Intrinsics.areEqual((Object) this.longName, (Object) bffCommonProduct.longName) && Intrinsics.areEqual((Object) this.nature, (Object) bffCommonProduct.nature) && Intrinsics.areEqual((Object) this.qualifier, (Object) bffCommonProduct.qualifier) && Intrinsics.areEqual((Object) this.subBrandName, (Object) bffCommonProduct.subBrandName) && Intrinsics.areEqual((Object) this.packaging, (Object) bffCommonProduct.packaging) && Intrinsics.areEqual((Object) this.brandName, (Object) bffCommonProduct.brandName) && Intrinsics.areEqual((Object) this.regulatedName, (Object) bffCommonProduct.regulatedName) && Intrinsics.areEqual((Object) this.keywordsConcatenated, (Object) bffCommonProduct.keywordsConcatenated) && Intrinsics.areEqual((Object) this.minMaxPrepVariableWeight, (Object) bffCommonProduct.minMaxPrepVariableWeight) && Intrinsics.areEqual((Object) this.profitSortIndex, (Object) bffCommonProduct.profitSortIndex) && Intrinsics.areEqual((Object) this.sortGroup, (Object) bffCommonProduct.sortGroup) && Intrinsics.areEqual((Object) this.mainInformation, (Object) bffCommonProduct.mainInformation) && Intrinsics.areEqual((Object) this.warningAdvices, (Object) bffCommonProduct.warningAdvices) && Intrinsics.areEqual((Object) this.consumerAdvice, (Object) bffCommonProduct.consumerAdvice) && Intrinsics.areEqual((Object) this.storageMode, (Object) bffCommonProduct.storageMode) && Intrinsics.areEqual((Object) this.serviceCenterContact, (Object) bffCommonProduct.serviceCenterContact) && Intrinsics.areEqual((Object) this.flavor, (Object) bffCommonProduct.flavor) && Intrinsics.areEqual((Object) this.productBenefits, (Object) bffCommonProduct.productBenefits) && Intrinsics.areEqual((Object) this.consumerBenefits, (Object) bffCommonProduct.consumerBenefits) && Intrinsics.areEqual((Object) this.advertisedInformations, (Object) bffCommonProduct.advertisedInformations) && Intrinsics.areEqual((Object) this.consumerAge, (Object) bffCommonProduct.consumerAge) && Intrinsics.areEqual((Object) this.healthClaims, (Object) bffCommonProduct.healthClaims) && Intrinsics.areEqual((Object) this.standardizedHealthClaims, (Object) bffCommonProduct.standardizedHealthClaims) && Intrinsics.areEqual((Object) this.primaryLinkNode, (Object) bffCommonProduct.primaryLinkNode) && Intrinsics.areEqual((Object) this.pictures, (Object) bffCommonProduct.pictures) && Intrinsics.areEqual((Object) this.flags, (Object) bffCommonProduct.flags) && Intrinsics.areEqual((Object) this.weightsAndMeasures, (Object) bffCommonProduct.weightsAndMeasures) && Intrinsics.areEqual((Object) this.marketingSalesUnit, (Object) bffCommonProduct.marketingSalesUnit) && Intrinsics.areEqual((Object) this.minimumAge, (Object) bffCommonProduct.minimumAge) && Intrinsics.areEqual((Object) this.maximumAge, (Object) bffCommonProduct.maximumAge) && Intrinsics.areEqual((Object) this.food, (Object) bffCommonProduct.food) && Intrinsics.areEqual((Object) this.nonFood, (Object) bffCommonProduct.nonFood) && Intrinsics.areEqual((Object) this.technicalAttributes, (Object) bffCommonProduct.technicalAttributes) && Intrinsics.areEqual((Object) this.additionalAttributes, (Object) bffCommonProduct.additionalAttributes) && Intrinsics.areEqual((Object) this.categories, (Object) bffCommonProduct.categories) && Intrinsics.areEqual((Object) this.source, (Object) bffCommonProduct.source) && Intrinsics.areEqual((Object) this.sourceCode, (Object) bffCommonProduct.sourceCode) && Intrinsics.areEqual((Object) this.articleShortTitle, (Object) bffCommonProduct.articleShortTitle) && Intrinsics.areEqual((Object) this.articleLongTitle, (Object) bffCommonProduct.articleLongTitle) && Intrinsics.areEqual((Object) this.articleShortDescription, (Object) bffCommonProduct.articleShortDescription) && Intrinsics.areEqual((Object) this.longDescription, (Object) bffCommonProduct.longDescription) && Intrinsics.areEqual((Object) this.label, (Object) bffCommonProduct.label) && Intrinsics.areEqual((Object) this.brandLogoId, (Object) bffCommonProduct.brandLogoId) && Intrinsics.areEqual((Object) this.productFormat, (Object) bffCommonProduct.productFormat) && Intrinsics.areEqual((Object) this.facetLabels, (Object) bffCommonProduct.facetLabels) && Intrinsics.areEqual((Object) this.status, (Object) bffCommonProduct.status) && Intrinsics.areEqual((Object) this.brandDescription, (Object) bffCommonProduct.brandDescription) && Intrinsics.areEqual((Object) this.hyperBcp, (Object) bffCommonProduct.hyperBcp) && Intrinsics.areEqual((Object) this.qrCodeUrl, (Object) bffCommonProduct.qrCodeUrl) && Intrinsics.areEqual((Object) this.dosage, (Object) bffCommonProduct.dosage) && Intrinsics.areEqual((Object) this.aocName, (Object) bffCommonProduct.aocName) && Intrinsics.areEqual((Object) this.informationFlagFormat, (Object) bffCommonProduct.informationFlagFormat) && Intrinsics.areEqual((Object) this.taxeMessage, (Object) bffCommonProduct.taxeMessage) && Intrinsics.areEqual((Object) this.isVariableWeight, (Object) bffCommonProduct.isVariableWeight) && Intrinsics.areEqual((Object) this.productType, (Object) bffCommonProduct.productType) && Intrinsics.areEqual((Object) this.warranty, (Object) bffCommonProduct.warranty) && Intrinsics.areEqual((Object) this.nonFoodAttributes, (Object) bffCommonProduct.nonFoodAttributes) && Intrinsics.areEqual((Object) this.fullDescription, (Object) bffCommonProduct.fullDescription) && Intrinsics.areEqual((Object) this.keyFeatures, (Object) bffCommonProduct.keyFeatures) && Intrinsics.areEqual((Object) this.repairIndex, (Object) bffCommonProduct.repairIndex) && Intrinsics.areEqual((Object) this.repairIndexUrl, (Object) bffCommonProduct.repairIndexUrl) && Intrinsics.areEqual((Object) this.bffIsFood, (Object) bffCommonProduct.bffIsFood) && Intrinsics.areEqual((Object) this.bffDisplayBrand, (Object) bffCommonProduct.bffDisplayBrand) && Intrinsics.areEqual((Object) this.bffDisplayName, (Object) bffCommonProduct.bffDisplayName) && Intrinsics.areEqual((Object) this.bffDeliveryModes, (Object) bffCommonProduct.bffDeliveryModes) && this.bffRepairIndexTemplate == bffCommonProduct.bffRepairIndexTemplate && Intrinsics.areEqual((Object) this.offers, (Object) bffCommonProduct.offers);
    }

    @C12580l
    public final BffAdditionalAttribute getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    @C12580l
    public final String getAdvertisedInformations() {
        return this.advertisedInformations;
    }

    @C12580l
    public final String getAocName() {
        return this.aocName;
    }

    @C12580l
    public final String getArticleLongTitle() {
        return this.articleLongTitle;
    }

    @C12580l
    public final String getArticleShortDescription() {
        return this.articleShortDescription;
    }

    @C12580l
    public final String getArticleShortTitle() {
        return this.articleShortTitle;
    }

    @C12580l
    public final List<String> getBffDeliveryModes() {
        return this.bffDeliveryModes;
    }

    @C12580l
    public final String getBffDisplayBrand() {
        return this.bffDisplayBrand;
    }

    @C12580l
    public final String getBffDisplayName() {
        return this.bffDisplayName;
    }

    @C12580l
    public final Boolean getBffIsFood() {
        return this.bffIsFood;
    }

    @C12580l
    public final BffRepairIndexTemplate getBffRepairIndexTemplate() {
        return this.bffRepairIndexTemplate;
    }

    @C12580l
    public final String getBrandDescription() {
        return this.brandDescription;
    }

    @C12580l
    public final Integer getBrandLogoId() {
        return this.brandLogoId;
    }

    @C12580l
    public final String getBrandName() {
        return this.brandName;
    }

    @C12580l
    public final List<BffCommonCategory> getCategories() {
        return this.categories;
    }

    @C12580l
    public final String getCdbase() {
        return this.cdbase;
    }

    @C12580l
    public final String getConsumerAdvice() {
        return this.consumerAdvice;
    }

    @C12580l
    public final String getConsumerAge() {
        return this.consumerAge;
    }

    @C12580l
    public final String getConsumerBenefits() {
        return this.consumerBenefits;
    }

    @C12580l
    public final Boolean getContainAlcohol() {
        return this.containAlcohol;
    }

    @C12580l
    public final Boolean getContainCafein() {
        return this.containCafein;
    }

    @C12580l
    public final String getDosage() {
        return this.dosage;
    }

    @C12580l
    public final String getFacetLabels() {
        return this.facetLabels;
    }

    @C12580l
    public final BffProductFlags getFlags() {
        return this.flags;
    }

    @C12580l
    public final String getFlavor() {
        return this.flavor;
    }

    @C12580l
    public final BffFood getFood() {
        return this.food;
    }

    @C12580l
    public final String getFullDescription() {
        return this.fullDescription;
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final String getHealthClaims() {
        return this.healthClaims;
    }

    @C12580l
    public final String getHyperBcp() {
        return this.hyperBcp;
    }

    @C12580l
    public final String getInformationFlagFormat() {
        return this.informationFlagFormat;
    }

    @C12580l
    public final String getKeyFeatures() {
        return this.keyFeatures;
    }

    @C12580l
    public final String getKeywordsConcatenated() {
        return this.keywordsConcatenated;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final String getLongDescription() {
        return this.longDescription;
    }

    @C12580l
    public final String getLongName() {
        return this.longName;
    }

    @C12580l
    public final String getMainInformation() {
        return this.mainInformation;
    }

    @C12580l
    public final BffMarketingSalesUnit getMarketingSalesUnit() {
        return this.marketingSalesUnit;
    }

    @C12580l
    public final BffMinimumAge getMaximumAge() {
        return this.maximumAge;
    }

    @C12580l
    public final Integer getMinMaxPrepVariableWeight() {
        return this.minMaxPrepVariableWeight;
    }

    @C12580l
    public final BffMinimumAge getMinimumAge() {
        return this.minimumAge;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final String getNature() {
        return this.nature;
    }

    @C12580l
    public final BffNonFood getNonFood() {
        return this.nonFood;
    }

    @C12580l
    public final List<BffNonFoodAttributes> getNonFoodAttributes() {
        return this.nonFoodAttributes;
    }

    @C12580l
    public final List<BffProductOffer> getOffers() {
        return this.offers;
    }

    @C12580l
    public final String getPackaging() {
        return this.packaging;
    }

    @C12580l
    public final BffPictures getPictures() {
        return this.pictures;
    }

    @C12580l
    public final String getPrimaryLinkNode() {
        return this.primaryLinkNode;
    }

    @C12580l
    public final String getProductBenefits() {
        return this.productBenefits;
    }

    @C12580l
    public final String getProductFormat() {
        return this.productFormat;
    }

    @C12580l
    public final String getProductType() {
        return this.productType;
    }

    @C12580l
    public final Integer getProfitSortIndex() {
        return this.profitSortIndex;
    }

    @C12580l
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    @C12580l
    public final String getQualifier() {
        return this.qualifier;
    }

    @C12580l
    public final String getRegulatedName() {
        return this.regulatedName;
    }

    @C12580l
    public final Double getRepairIndex() {
        return this.repairIndex;
    }

    @C12580l
    public final String getRepairIndexUrl() {
        return this.repairIndexUrl;
    }

    @C12580l
    public final Double getScore() {
        return this.score;
    }

    @C12580l
    public final String getServiceCenterContact() {
        return this.serviceCenterContact;
    }

    @C12580l
    public final String getSortGroup() {
        return this.sortGroup;
    }

    @C12580l
    public final String getSource() {
        return this.source;
    }

    @C12580l
    public final String getSourceCode() {
        return this.sourceCode;
    }

    @C12580l
    public final List<String> getStandardizedHealthClaims() {
        return this.standardizedHealthClaims;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    @C12580l
    public final String getStorageMode() {
        return this.storageMode;
    }

    @C12580l
    public final String getSubBrandName() {
        return this.subBrandName;
    }

    @C12580l
    public final String getTaxeMessage() {
        return this.taxeMessage;
    }

    @C12580l
    public final BffTechnicalAttribute getTechnicalAttributes() {
        return this.technicalAttributes;
    }

    @C12580l
    public final String getWarningAdvices() {
        return this.warningAdvices;
    }

    @C12580l
    public final Integer getWarranty() {
        return this.warranty;
    }

    @C12580l
    public final BffWeightsAndMeasures getWeightsAndMeasures() {
        return this.weightsAndMeasures;
    }

    public int hashCode() {
        Double d = this.score;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.gtin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cdbase;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isMatchedColor;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.containAlcohol;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.containCafein;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.longName;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nature;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.qualifier;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subBrandName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.packaging;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.brandName;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.regulatedName;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.keywordsConcatenated;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.minMaxPrepVariableWeight;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.profitSortIndex;
        int hashCode17 = (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.sortGroup;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.mainInformation;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.warningAdvices;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.consumerAdvice;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.storageMode;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.serviceCenterContact;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.flavor;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.productBenefits;
        int hashCode25 = (hashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.consumerBenefits;
        int hashCode26 = (hashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.advertisedInformations;
        int hashCode27 = (hashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.consumerAge;
        int hashCode28 = (hashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.healthClaims;
        int hashCode29 = (hashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        List<String> list = this.standardizedHealthClaims;
        int hashCode30 = (hashCode29 + (list == null ? 0 : list.hashCode())) * 31;
        String str24 = this.primaryLinkNode;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        BffPictures bffPictures = this.pictures;
        int hashCode32 = (hashCode31 + (bffPictures == null ? 0 : bffPictures.hashCode())) * 31;
        BffProductFlags bffProductFlags = this.flags;
        int hashCode33 = (hashCode32 + (bffProductFlags == null ? 0 : bffProductFlags.hashCode())) * 31;
        BffWeightsAndMeasures bffWeightsAndMeasures = this.weightsAndMeasures;
        int hashCode34 = (hashCode33 + (bffWeightsAndMeasures == null ? 0 : bffWeightsAndMeasures.hashCode())) * 31;
        BffMarketingSalesUnit bffMarketingSalesUnit = this.marketingSalesUnit;
        int hashCode35 = (hashCode34 + (bffMarketingSalesUnit == null ? 0 : bffMarketingSalesUnit.hashCode())) * 31;
        BffMinimumAge bffMinimumAge = this.minimumAge;
        int hashCode36 = (hashCode35 + (bffMinimumAge == null ? 0 : bffMinimumAge.hashCode())) * 31;
        BffMinimumAge bffMinimumAge2 = this.maximumAge;
        int hashCode37 = (hashCode36 + (bffMinimumAge2 == null ? 0 : bffMinimumAge2.hashCode())) * 31;
        BffFood bffFood = this.food;
        int hashCode38 = (hashCode37 + (bffFood == null ? 0 : bffFood.hashCode())) * 31;
        BffNonFood bffNonFood = this.nonFood;
        int hashCode39 = (hashCode38 + (bffNonFood == null ? 0 : bffNonFood.hashCode())) * 31;
        BffTechnicalAttribute bffTechnicalAttribute = this.technicalAttributes;
        int hashCode40 = (hashCode39 + (bffTechnicalAttribute == null ? 0 : bffTechnicalAttribute.hashCode())) * 31;
        BffAdditionalAttribute bffAdditionalAttribute = this.additionalAttributes;
        int hashCode41 = (hashCode40 + (bffAdditionalAttribute == null ? 0 : bffAdditionalAttribute.hashCode())) * 31;
        List<BffCommonCategory> list2 = this.categories;
        int hashCode42 = (hashCode41 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str25 = this.source;
        int hashCode43 = (hashCode42 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.sourceCode;
        int hashCode44 = (hashCode43 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.articleShortTitle;
        int hashCode45 = (hashCode44 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.articleLongTitle;
        int hashCode46 = (hashCode45 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.articleShortDescription;
        int hashCode47 = (hashCode46 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.longDescription;
        int hashCode48 = (hashCode47 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.label;
        int hashCode49 = (hashCode48 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Integer num3 = this.brandLogoId;
        int hashCode50 = (hashCode49 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str32 = this.productFormat;
        int hashCode51 = (hashCode50 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.facetLabels;
        int hashCode52 = (hashCode51 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.status;
        int hashCode53 = (hashCode52 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.brandDescription;
        int hashCode54 = (hashCode53 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.hyperBcp;
        int hashCode55 = (hashCode54 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.qrCodeUrl;
        int hashCode56 = (hashCode55 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.dosage;
        int hashCode57 = (hashCode56 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.aocName;
        int hashCode58 = (hashCode57 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.informationFlagFormat;
        int hashCode59 = (hashCode58 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.taxeMessage;
        int hashCode60 = (hashCode59 + (str41 == null ? 0 : str41.hashCode())) * 31;
        Boolean bool4 = this.isVariableWeight;
        int hashCode61 = (hashCode60 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str42 = this.productType;
        int hashCode62 = (hashCode61 + (str42 == null ? 0 : str42.hashCode())) * 31;
        Integer num4 = this.warranty;
        int hashCode63 = (hashCode62 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<BffNonFoodAttributes> list3 = this.nonFoodAttributes;
        int hashCode64 = (hashCode63 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str43 = this.fullDescription;
        int hashCode65 = (hashCode64 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.keyFeatures;
        int hashCode66 = (hashCode65 + (str44 == null ? 0 : str44.hashCode())) * 31;
        Double d2 = this.repairIndex;
        int hashCode67 = (hashCode66 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str45 = this.repairIndexUrl;
        int hashCode68 = (hashCode67 + (str45 == null ? 0 : str45.hashCode())) * 31;
        Boolean bool5 = this.bffIsFood;
        int hashCode69 = (hashCode68 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str46 = this.bffDisplayBrand;
        int hashCode70 = (hashCode69 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.bffDisplayName;
        int hashCode71 = (hashCode70 + (str47 == null ? 0 : str47.hashCode())) * 31;
        List<String> list4 = this.bffDeliveryModes;
        int hashCode72 = (hashCode71 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BffRepairIndexTemplate bffRepairIndexTemplate2 = this.bffRepairIndexTemplate;
        int hashCode73 = (hashCode72 + (bffRepairIndexTemplate2 == null ? 0 : bffRepairIndexTemplate2.hashCode())) * 31;
        List<BffProductOffer> list5 = this.offers;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode73 + i;
    }

    @C12580l
    public final Boolean isMatchedColor() {
        return this.isMatchedColor;
    }

    @C12580l
    public final Boolean isVariableWeight() {
        return this.isVariableWeight;
    }

    @C12579k
    public String toString() {
        Double d = this.score;
        String str = this.gtin;
        String str2 = this.cdbase;
        String str3 = this.name;
        Boolean bool = this.isMatchedColor;
        Boolean bool2 = this.containAlcohol;
        Boolean bool3 = this.containCafein;
        String str4 = this.longName;
        String str5 = this.nature;
        String str6 = this.qualifier;
        String str7 = this.subBrandName;
        String str8 = this.packaging;
        String str9 = this.brandName;
        String str10 = this.regulatedName;
        String str11 = this.keywordsConcatenated;
        Integer num = this.minMaxPrepVariableWeight;
        Integer num2 = this.profitSortIndex;
        String str12 = this.sortGroup;
        String str13 = this.mainInformation;
        String str14 = this.warningAdvices;
        String str15 = this.consumerAdvice;
        String str16 = this.storageMode;
        String str17 = this.serviceCenterContact;
        String str18 = this.flavor;
        String str19 = this.productBenefits;
        String str20 = this.consumerBenefits;
        String str21 = this.advertisedInformations;
        String str22 = this.consumerAge;
        String str23 = this.healthClaims;
        List<String> list = this.standardizedHealthClaims;
        String str24 = this.primaryLinkNode;
        BffPictures bffPictures = this.pictures;
        BffProductFlags bffProductFlags = this.flags;
        BffWeightsAndMeasures bffWeightsAndMeasures = this.weightsAndMeasures;
        BffMarketingSalesUnit bffMarketingSalesUnit = this.marketingSalesUnit;
        BffMinimumAge bffMinimumAge = this.minimumAge;
        BffMinimumAge bffMinimumAge2 = this.maximumAge;
        BffFood bffFood = this.food;
        BffNonFood bffNonFood = this.nonFood;
        BffTechnicalAttribute bffTechnicalAttribute = this.technicalAttributes;
        BffAdditionalAttribute bffAdditionalAttribute = this.additionalAttributes;
        List<BffCommonCategory> list2 = this.categories;
        String str25 = this.source;
        String str26 = this.sourceCode;
        String str27 = this.articleShortTitle;
        String str28 = this.articleLongTitle;
        String str29 = this.articleShortDescription;
        String str30 = this.longDescription;
        String str31 = this.label;
        Integer num3 = this.brandLogoId;
        String str32 = this.productFormat;
        String str33 = this.facetLabels;
        String str34 = this.status;
        String str35 = this.brandDescription;
        String str36 = this.hyperBcp;
        String str37 = this.qrCodeUrl;
        String str38 = this.dosage;
        String str39 = this.aocName;
        String str40 = this.informationFlagFormat;
        String str41 = this.taxeMessage;
        Boolean bool4 = this.isVariableWeight;
        String str42 = this.productType;
        Integer num4 = this.warranty;
        List<BffNonFoodAttributes> list3 = this.nonFoodAttributes;
        String str43 = this.fullDescription;
        String str44 = this.keyFeatures;
        Double d2 = this.repairIndex;
        String str45 = this.repairIndexUrl;
        Boolean bool5 = this.bffIsFood;
        String str46 = this.bffDisplayBrand;
        String str47 = this.bffDisplayName;
        List<String> list4 = this.bffDeliveryModes;
        BffRepairIndexTemplate bffRepairIndexTemplate2 = this.bffRepairIndexTemplate;
        List<BffProductOffer> list5 = this.offers;
        return "BffCommonProduct(score=" + d + ", gtin=" + str + ", cdbase=" + str2 + ", name=" + str3 + ", isMatchedColor=" + bool + ", containAlcohol=" + bool2 + ", containCafein=" + bool3 + ", longName=" + str4 + ", nature=" + str5 + ", qualifier=" + str6 + ", subBrandName=" + str7 + ", packaging=" + str8 + ", brandName=" + str9 + ", regulatedName=" + str10 + ", keywordsConcatenated=" + str11 + ", minMaxPrepVariableWeight=" + num + ", profitSortIndex=" + num2 + ", sortGroup=" + str12 + ", mainInformation=" + str13 + ", warningAdvices=" + str14 + ", consumerAdvice=" + str15 + ", storageMode=" + str16 + ", serviceCenterContact=" + str17 + ", flavor=" + str18 + ", productBenefits=" + str19 + ", consumerBenefits=" + str20 + ", advertisedInformations=" + str21 + ", consumerAge=" + str22 + ", healthClaims=" + str23 + ", standardizedHealthClaims=" + list + ", primaryLinkNode=" + str24 + ", pictures=" + bffPictures + ", flags=" + bffProductFlags + ", weightsAndMeasures=" + bffWeightsAndMeasures + ", marketingSalesUnit=" + bffMarketingSalesUnit + ", minimumAge=" + bffMinimumAge + ", maximumAge=" + bffMinimumAge2 + ", food=" + bffFood + ", nonFood=" + bffNonFood + ", technicalAttributes=" + bffTechnicalAttribute + ", additionalAttributes=" + bffAdditionalAttribute + ", categories=" + list2 + ", source=" + str25 + ", sourceCode=" + str26 + ", articleShortTitle=" + str27 + ", articleLongTitle=" + str28 + ", articleShortDescription=" + str29 + ", longDescription=" + str30 + ", label=" + str31 + ", brandLogoId=" + num3 + ", productFormat=" + str32 + ", facetLabels=" + str33 + ", status=" + str34 + ", brandDescription=" + str35 + ", hyperBcp=" + str36 + ", qrCodeUrl=" + str37 + ", dosage=" + str38 + ", aocName=" + str39 + ", informationFlagFormat=" + str40 + ", taxeMessage=" + str41 + ", isVariableWeight=" + bool4 + ", productType=" + str42 + ", warranty=" + num4 + ", nonFoodAttributes=" + list3 + ", fullDescription=" + str43 + ", keyFeatures=" + str44 + ", repairIndex=" + d2 + ", repairIndexUrl=" + str45 + ", bffIsFood=" + bool5 + ", bffDisplayBrand=" + str46 + ", bffDisplayName=" + str47 + ", bffDeliveryModes=" + list4 + ", bffRepairIndexTemplate=" + bffRepairIndexTemplate2 + ", offers=" + list5 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCommonProduct(int i, int i2, int i3, @C12438n("score") Double d, @C12438n("gtin") String str, @C12438n("cdbase") String str2, @C12438n("name") String str3, @C12438n("is_matched_color") Boolean bool, @C12438n("contain_alcohol") Boolean bool2, @C12438n("contain_cafein") Boolean bool3, @C12438n("long_name") String str4, @C12438n("nature") String str5, @C12438n("qualifier") String str6, @C12438n("sub_brand_name") String str7, @C12438n("packaging") String str8, @C12438n("brand_name") String str9, @C12438n("regulated_name") String str10, @C12438n("keywords_concatenated") String str11, @C12438n("min_max_prep_variable_weight") Integer num, @C12438n("profit_sort_index") Integer num2, @C12438n("sort_group") String str12, @C12438n("main_information") String str13, @C12438n("warning_advices") String str14, @C12438n("consumer_advice") String str15, @C12438n("storage_mode") String str16, @C12438n("service_center_contact") String str17, @C12438n("flavor") String str18, @C12438n("product_benefits") String str19, @C12438n("consumer_benefits") String str20, @C12438n("advertised_informations") String str21, @C12438n("consumer_age") String str22, @C12438n("health_claims") String str23, @C12438n("standardized_health_claims") List list, @C12438n("primary_link_node") String str24, @C12438n("pictures") BffPictures bffPictures, @C12438n("flags") BffProductFlags bffProductFlags, @C12438n("weights_and_measures") BffWeightsAndMeasures bffWeightsAndMeasures, @C12438n("marketing_sales_unit") BffMarketingSalesUnit bffMarketingSalesUnit, @C12438n("minimum_age") BffMinimumAge bffMinimumAge, @C12438n("maximum_age") BffMinimumAge bffMinimumAge2, @C12438n("food") BffFood bffFood, @C12438n("non_food") BffNonFood bffNonFood, @C12438n("technical_attributes") BffTechnicalAttribute bffTechnicalAttribute, @C12438n("additional_attributes") BffAdditionalAttribute bffAdditionalAttribute, @C12438n("categories") List list2, @C12438n("source") String str25, @C12438n("source_code") String str26, @C12438n("article_short_title") String str27, @C12438n("article_long_title") String str28, @C12438n("article_short_description") String str29, @C12438n("long_description") String str30, @C12438n("label") String str31, @C12438n("brand_logo_id") Integer num3, @C12438n("product_format") String str32, @C12438n("facet_labels") String str33, @C12438n("status") String str34, @C12438n("brand_description") String str35, @C12438n("hyper_bcp") String str36, @C12438n("qr_code_url") String str37, @C12438n("dosage") String str38, @C12438n("aoc_name") String str39, @C12438n("information_flag_format") String str40, @C12438n("taxe_message") String str41, @C12438n("is_variable_weight") Boolean bool4, @C12438n("product_type") String str42, @C12438n("warranty") Integer num4, @C12438n("non_food_attributes") List list3, @C12438n("full_description") String str43, @C12438n("key_features") String str44, @C12438n("repair_index") Double d2, @C12438n("repair_index_url") String str45, @C12438n("bff_is_food") Boolean bool5, @C12438n("bff_display_brand") String str46, @C12438n("bff_display_name") String str47, @C12438n("bff_delivery_modes") List list4, @C12438n("bff_repair_index_template") BffRepairIndexTemplate bffRepairIndexTemplate2, @C12438n("offers") List list5, C12295n1 n1Var) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if ((((i4 & 0) != 0) | ((i5 & 0) != 0)) || ((i6 & 0) != 0)) {
            C12261c1.m49255a(new int[]{i4, i5, i6}, new int[]{0, 0, 0}, BffCommonProduct$$serializer.INSTANCE.getDescriptor());
        }
        if ((i4 & 1) == 0) {
            this.score = null;
        } else {
            this.score = d;
        }
        if ((i4 & 2) == 0) {
            this.gtin = null;
        } else {
            this.gtin = str;
        }
        if ((i4 & 4) == 0) {
            this.cdbase = null;
        } else {
            this.cdbase = str2;
        }
        if ((i4 & 8) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i4 & 16) == 0) {
            this.isMatchedColor = null;
        } else {
            this.isMatchedColor = bool;
        }
        if ((i4 & 32) == 0) {
            this.containAlcohol = null;
        } else {
            this.containAlcohol = bool2;
        }
        if ((i4 & 64) == 0) {
            this.containCafein = null;
        } else {
            this.containCafein = bool3;
        }
        if ((i4 & 128) == 0) {
            this.longName = null;
        } else {
            this.longName = str4;
        }
        if ((i4 & 256) == 0) {
            this.nature = null;
        } else {
            this.nature = str5;
        }
        if ((i4 & 512) == 0) {
            this.qualifier = null;
        } else {
            this.qualifier = str6;
        }
        if ((i4 & 1024) == 0) {
            this.subBrandName = null;
        } else {
            this.subBrandName = str7;
        }
        if ((i4 & 2048) == 0) {
            this.packaging = null;
        } else {
            this.packaging = str8;
        }
        if ((i4 & 4096) == 0) {
            this.brandName = null;
        } else {
            this.brandName = str9;
        }
        if ((i4 & 8192) == 0) {
            this.regulatedName = null;
        } else {
            this.regulatedName = str10;
        }
        if ((i4 & 16384) == 0) {
            this.keywordsConcatenated = null;
        } else {
            this.keywordsConcatenated = str11;
        }
        if ((i4 & 32768) == 0) {
            this.minMaxPrepVariableWeight = null;
        } else {
            this.minMaxPrepVariableWeight = num;
        }
        if ((i4 & 65536) == 0) {
            this.profitSortIndex = null;
        } else {
            this.profitSortIndex = num2;
        }
        if ((i4 & 131072) == 0) {
            this.sortGroup = null;
        } else {
            this.sortGroup = str12;
        }
        if ((i4 & 262144) == 0) {
            this.mainInformation = null;
        } else {
            this.mainInformation = str13;
        }
        if ((524288 & i4) == 0) {
            this.warningAdvices = null;
        } else {
            this.warningAdvices = str14;
        }
        if ((1048576 & i4) == 0) {
            this.consumerAdvice = null;
        } else {
            this.consumerAdvice = str15;
        }
        if ((2097152 & i4) == 0) {
            this.storageMode = null;
        } else {
            this.storageMode = str16;
        }
        if ((4194304 & i4) == 0) {
            this.serviceCenterContact = null;
        } else {
            this.serviceCenterContact = str17;
        }
        if ((8388608 & i4) == 0) {
            this.flavor = null;
        } else {
            this.flavor = str18;
        }
        if ((16777216 & i4) == 0) {
            this.productBenefits = null;
        } else {
            this.productBenefits = str19;
        }
        if ((33554432 & i4) == 0) {
            this.consumerBenefits = null;
        } else {
            this.consumerBenefits = str20;
        }
        if ((67108864 & i4) == 0) {
            this.advertisedInformations = null;
        } else {
            this.advertisedInformations = str21;
        }
        if ((134217728 & i4) == 0) {
            this.consumerAge = null;
        } else {
            this.consumerAge = str22;
        }
        if ((268435456 & i4) == 0) {
            this.healthClaims = null;
        } else {
            this.healthClaims = str23;
        }
        if ((536870912 & i4) == 0) {
            this.standardizedHealthClaims = null;
        } else {
            this.standardizedHealthClaims = list;
        }
        if ((1073741824 & i4) == 0) {
            this.primaryLinkNode = null;
        } else {
            this.primaryLinkNode = str24;
        }
        if ((i4 & Integer.MIN_VALUE) == 0) {
            this.pictures = null;
        } else {
            this.pictures = bffPictures;
        }
        if ((i5 & 1) == 0) {
            this.flags = null;
        } else {
            this.flags = bffProductFlags;
        }
        if ((i5 & 2) == 0) {
            this.weightsAndMeasures = null;
        } else {
            this.weightsAndMeasures = bffWeightsAndMeasures;
        }
        if ((i5 & 4) == 0) {
            this.marketingSalesUnit = null;
        } else {
            this.marketingSalesUnit = bffMarketingSalesUnit;
        }
        if ((i5 & 8) == 0) {
            this.minimumAge = null;
        } else {
            this.minimumAge = bffMinimumAge;
        }
        if ((i5 & 16) == 0) {
            this.maximumAge = null;
        } else {
            this.maximumAge = bffMinimumAge2;
        }
        if ((i5 & 32) == 0) {
            this.food = null;
        } else {
            this.food = bffFood;
        }
        if ((i5 & 64) == 0) {
            this.nonFood = null;
        } else {
            this.nonFood = bffNonFood;
        }
        if ((i5 & 128) == 0) {
            this.technicalAttributes = null;
        } else {
            this.technicalAttributes = bffTechnicalAttribute;
        }
        if ((i5 & 256) == 0) {
            this.additionalAttributes = null;
        } else {
            this.additionalAttributes = bffAdditionalAttribute;
        }
        if ((i5 & 512) == 0) {
            this.categories = null;
        } else {
            this.categories = list2;
        }
        if ((i5 & 1024) == 0) {
            this.source = null;
        } else {
            this.source = str25;
        }
        if ((i5 & 2048) == 0) {
            this.sourceCode = null;
        } else {
            this.sourceCode = str26;
        }
        if ((i5 & 4096) == 0) {
            this.articleShortTitle = null;
        } else {
            this.articleShortTitle = str27;
        }
        if ((i5 & 8192) == 0) {
            this.articleLongTitle = null;
        } else {
            this.articleLongTitle = str28;
        }
        if ((i5 & 16384) == 0) {
            this.articleShortDescription = null;
        } else {
            this.articleShortDescription = str29;
        }
        if ((i5 & 32768) == 0) {
            this.longDescription = null;
        } else {
            this.longDescription = str30;
        }
        if ((i5 & 65536) == 0) {
            this.label = null;
        } else {
            this.label = str31;
        }
        if ((i5 & 131072) == 0) {
            this.brandLogoId = null;
        } else {
            this.brandLogoId = num3;
        }
        if ((i5 & 262144) == 0) {
            this.productFormat = null;
        } else {
            this.productFormat = str32;
        }
        if ((524288 & i5) == 0) {
            this.facetLabels = null;
        } else {
            this.facetLabels = str33;
        }
        if ((1048576 & i5) == 0) {
            this.status = null;
        } else {
            this.status = str34;
        }
        if ((2097152 & i5) == 0) {
            this.brandDescription = null;
        } else {
            this.brandDescription = str35;
        }
        if ((4194304 & i5) == 0) {
            this.hyperBcp = null;
        } else {
            this.hyperBcp = str36;
        }
        if ((8388608 & i5) == 0) {
            this.qrCodeUrl = null;
        } else {
            this.qrCodeUrl = str37;
        }
        if ((16777216 & i5) == 0) {
            this.dosage = null;
        } else {
            this.dosage = str38;
        }
        if ((33554432 & i5) == 0) {
            this.aocName = null;
        } else {
            this.aocName = str39;
        }
        if ((67108864 & i5) == 0) {
            this.informationFlagFormat = null;
        } else {
            this.informationFlagFormat = str40;
        }
        if ((134217728 & i5) == 0) {
            this.taxeMessage = null;
        } else {
            this.taxeMessage = str41;
        }
        if ((268435456 & i5) == 0) {
            this.isVariableWeight = null;
        } else {
            this.isVariableWeight = bool4;
        }
        if ((536870912 & i5) == 0) {
            this.productType = null;
        } else {
            this.productType = str42;
        }
        if ((1073741824 & i5) == 0) {
            this.warranty = null;
        } else {
            this.warranty = num4;
        }
        if ((Integer.MIN_VALUE & i5) == 0) {
            this.nonFoodAttributes = null;
        } else {
            this.nonFoodAttributes = list3;
        }
        if ((i6 & 1) == 0) {
            this.fullDescription = null;
        } else {
            this.fullDescription = str43;
        }
        if ((i6 & 2) == 0) {
            this.keyFeatures = null;
        } else {
            this.keyFeatures = str44;
        }
        if ((i6 & 4) == 0) {
            this.repairIndex = null;
        } else {
            this.repairIndex = d2;
        }
        if ((i6 & 8) == 0) {
            this.repairIndexUrl = null;
        } else {
            this.repairIndexUrl = str45;
        }
        if ((i6 & 16) == 0) {
            this.bffIsFood = null;
        } else {
            this.bffIsFood = bool5;
        }
        if ((i6 & 32) == 0) {
            this.bffDisplayBrand = null;
        } else {
            this.bffDisplayBrand = str46;
        }
        if ((i6 & 64) == 0) {
            this.bffDisplayName = null;
        } else {
            this.bffDisplayName = str47;
        }
        if ((i6 & 128) == 0) {
            this.bffDeliveryModes = null;
        } else {
            this.bffDeliveryModes = list4;
        }
        if ((i6 & 256) == 0) {
            this.bffRepairIndexTemplate = null;
        } else {
            this.bffRepairIndexTemplate = bffRepairIndexTemplate2;
        }
        if ((i6 & 512) == 0) {
            this.offers = null;
        } else {
            this.offers = list5;
        }
    }

    public BffCommonProduct(@C12580l Double d, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l Integer num, @C12580l Integer num2, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l String str22, @C12580l String str23, @C12580l List<String> list, @C12580l String str24, @C12580l BffPictures bffPictures, @C12580l BffProductFlags bffProductFlags, @C12580l BffWeightsAndMeasures bffWeightsAndMeasures, @C12580l BffMarketingSalesUnit bffMarketingSalesUnit, @C12580l BffMinimumAge bffMinimumAge, @C12580l BffMinimumAge bffMinimumAge2, @C12580l BffFood bffFood, @C12580l BffNonFood bffNonFood, @C12580l BffTechnicalAttribute bffTechnicalAttribute, @C12580l BffAdditionalAttribute bffAdditionalAttribute, @C12580l List<BffCommonCategory> list2, @C12580l String str25, @C12580l String str26, @C12580l String str27, @C12580l String str28, @C12580l String str29, @C12580l String str30, @C12580l String str31, @C12580l Integer num3, @C12580l String str32, @C12580l String str33, @C12580l String str34, @C12580l String str35, @C12580l String str36, @C12580l String str37, @C12580l String str38, @C12580l String str39, @C12580l String str40, @C12580l String str41, @C12580l Boolean bool4, @C12580l String str42, @C12580l Integer num4, @C12580l List<BffNonFoodAttributes> list3, @C12580l String str43, @C12580l String str44, @C12580l Double d2, @C12580l String str45, @C12580l Boolean bool5, @C12580l String str46, @C12580l String str47, @C12580l List<String> list4, @C12580l BffRepairIndexTemplate bffRepairIndexTemplate2, @C12580l List<BffProductOffer> list5) {
        this.score = d;
        this.gtin = str;
        this.cdbase = str2;
        this.name = str3;
        this.isMatchedColor = bool;
        this.containAlcohol = bool2;
        this.containCafein = bool3;
        this.longName = str4;
        this.nature = str5;
        this.qualifier = str6;
        this.subBrandName = str7;
        this.packaging = str8;
        this.brandName = str9;
        this.regulatedName = str10;
        this.keywordsConcatenated = str11;
        this.minMaxPrepVariableWeight = num;
        this.profitSortIndex = num2;
        this.sortGroup = str12;
        this.mainInformation = str13;
        this.warningAdvices = str14;
        this.consumerAdvice = str15;
        this.storageMode = str16;
        this.serviceCenterContact = str17;
        this.flavor = str18;
        this.productBenefits = str19;
        this.consumerBenefits = str20;
        this.advertisedInformations = str21;
        this.consumerAge = str22;
        this.healthClaims = str23;
        this.standardizedHealthClaims = list;
        this.primaryLinkNode = str24;
        this.pictures = bffPictures;
        this.flags = bffProductFlags;
        this.weightsAndMeasures = bffWeightsAndMeasures;
        this.marketingSalesUnit = bffMarketingSalesUnit;
        this.minimumAge = bffMinimumAge;
        this.maximumAge = bffMinimumAge2;
        this.food = bffFood;
        this.nonFood = bffNonFood;
        this.technicalAttributes = bffTechnicalAttribute;
        this.additionalAttributes = bffAdditionalAttribute;
        this.categories = list2;
        this.source = str25;
        this.sourceCode = str26;
        this.articleShortTitle = str27;
        this.articleLongTitle = str28;
        this.articleShortDescription = str29;
        this.longDescription = str30;
        this.label = str31;
        this.brandLogoId = num3;
        this.productFormat = str32;
        this.facetLabels = str33;
        this.status = str34;
        this.brandDescription = str35;
        this.hyperBcp = str36;
        this.qrCodeUrl = str37;
        this.dosage = str38;
        this.aocName = str39;
        this.informationFlagFormat = str40;
        this.taxeMessage = str41;
        this.isVariableWeight = bool4;
        this.productType = str42;
        this.warranty = num4;
        this.nonFoodAttributes = list3;
        this.fullDescription = str43;
        this.keyFeatures = str44;
        this.repairIndex = d2;
        this.repairIndexUrl = str45;
        this.bffIsFood = bool5;
        this.bffDisplayBrand = str46;
        this.bffDisplayName = str47;
        this.bffDeliveryModes = list4;
        this.bffRepairIndexTemplate = bffRepairIndexTemplate2;
        this.offers = list5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCommonProduct(java.lang.Double r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.Boolean r77, java.lang.Boolean r78, java.lang.Boolean r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.lang.Integer r88, java.lang.Integer r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.String r99, java.lang.String r100, java.lang.String r101, java.util.List r102, java.lang.String r103, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPictures r104, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductFlags r105, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeightsAndMeasures r106, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMarketingSalesUnit r107, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMinimumAge r108, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMinimumAge r109, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood r110, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffNonFood r111, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTechnicalAttribute r112, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalAttribute r113, java.util.List r114, java.lang.String r115, java.lang.String r116, java.lang.String r117, java.lang.String r118, java.lang.String r119, java.lang.String r120, java.lang.String r121, java.lang.Integer r122, java.lang.String r123, java.lang.String r124, java.lang.String r125, java.lang.String r126, java.lang.String r127, java.lang.String r128, java.lang.String r129, java.lang.String r130, java.lang.String r131, java.lang.String r132, java.lang.Boolean r133, java.lang.String r134, java.lang.Integer r135, java.util.List r136, java.lang.String r137, java.lang.String r138, java.lang.Double r139, java.lang.String r140, java.lang.Boolean r141, java.lang.String r142, java.lang.String r143, java.util.List r144, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct.BffRepairIndexTemplate r145, java.util.List r146, int r147, int r148, int r149, kotlin.jvm.internal.DefaultConstructorMarker r150) {
        /*
            r72 = this;
            r0 = r147
            r1 = r148
            r2 = r149
            r3 = r0 & 1
            if (r3 == 0) goto L_0x000c
            r3 = 0
            goto L_0x000e
        L_0x000c:
            r3 = r73
        L_0x000e:
            r5 = r0 & 2
            if (r5 == 0) goto L_0x0014
            r5 = 0
            goto L_0x0016
        L_0x0014:
            r5 = r74
        L_0x0016:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x001c
            r6 = 0
            goto L_0x001e
        L_0x001c:
            r6 = r75
        L_0x001e:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0024
            r7 = 0
            goto L_0x0026
        L_0x0024:
            r7 = r76
        L_0x0026:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002c
            r8 = 0
            goto L_0x002e
        L_0x002c:
            r8 = r77
        L_0x002e:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0034
            r9 = 0
            goto L_0x0036
        L_0x0034:
            r9 = r78
        L_0x0036:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003c
            r10 = 0
            goto L_0x003e
        L_0x003c:
            r10 = r79
        L_0x003e:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0044
            r11 = 0
            goto L_0x0046
        L_0x0044:
            r11 = r80
        L_0x0046:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004c
            r12 = 0
            goto L_0x004e
        L_0x004c:
            r12 = r81
        L_0x004e:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0054
            r13 = 0
            goto L_0x0056
        L_0x0054:
            r13 = r82
        L_0x0056:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005c
            r14 = 0
            goto L_0x005e
        L_0x005c:
            r14 = r83
        L_0x005e:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0064
            r15 = 0
            goto L_0x0066
        L_0x0064:
            r15 = r84
        L_0x0066:
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x006c
            r4 = 0
            goto L_0x006e
        L_0x006c:
            r4 = r85
        L_0x006e:
            r16 = r4
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0076
            r4 = 0
            goto L_0x0078
        L_0x0076:
            r4 = r86
        L_0x0078:
            r17 = r4
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0080
            r4 = 0
            goto L_0x0082
        L_0x0080:
            r4 = r87
        L_0x0082:
            r18 = 32768(0x8000, float:4.5918E-41)
            r19 = r0 & r18
            if (r19 == 0) goto L_0x008c
            r19 = 0
            goto L_0x008e
        L_0x008c:
            r19 = r88
        L_0x008e:
            r20 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r20
            if (r21 == 0) goto L_0x0097
            r21 = 0
            goto L_0x0099
        L_0x0097:
            r21 = r89
        L_0x0099:
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = r0 & r22
            if (r23 == 0) goto L_0x00a2
            r23 = 0
            goto L_0x00a4
        L_0x00a2:
            r23 = r90
        L_0x00a4:
            r24 = 262144(0x40000, float:3.67342E-40)
            r25 = r0 & r24
            if (r25 == 0) goto L_0x00ad
            r25 = 0
            goto L_0x00af
        L_0x00ad:
            r25 = r91
        L_0x00af:
            r26 = 524288(0x80000, float:7.34684E-40)
            r27 = r0 & r26
            if (r27 == 0) goto L_0x00b8
            r27 = 0
            goto L_0x00ba
        L_0x00b8:
            r27 = r92
        L_0x00ba:
            r28 = 1048576(0x100000, float:1.469368E-39)
            r29 = r0 & r28
            if (r29 == 0) goto L_0x00c3
            r29 = 0
            goto L_0x00c5
        L_0x00c3:
            r29 = r93
        L_0x00c5:
            r30 = 2097152(0x200000, float:2.938736E-39)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00ce
            r30 = 0
            goto L_0x00d0
        L_0x00ce:
            r30 = r94
        L_0x00d0:
            r31 = 4194304(0x400000, float:5.877472E-39)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x00d9
            r31 = 0
            goto L_0x00db
        L_0x00d9:
            r31 = r95
        L_0x00db:
            r32 = 8388608(0x800000, float:1.17549435E-38)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x00e4
            r32 = 0
            goto L_0x00e6
        L_0x00e4:
            r32 = r96
        L_0x00e6:
            r33 = 16777216(0x1000000, float:2.3509887E-38)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x00ef
            r33 = 0
            goto L_0x00f1
        L_0x00ef:
            r33 = r97
        L_0x00f1:
            r34 = 33554432(0x2000000, float:9.403955E-38)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x00fa
            r34 = 0
            goto L_0x00fc
        L_0x00fa:
            r34 = r98
        L_0x00fc:
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x0105
            r35 = 0
            goto L_0x0107
        L_0x0105:
            r35 = r99
        L_0x0107:
            r36 = 134217728(0x8000000, float:3.85186E-34)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x0110
            r36 = 0
            goto L_0x0112
        L_0x0110:
            r36 = r100
        L_0x0112:
            r37 = 268435456(0x10000000, float:2.5243549E-29)
            r37 = r0 & r37
            if (r37 == 0) goto L_0x011b
            r37 = 0
            goto L_0x011d
        L_0x011b:
            r37 = r101
        L_0x011d:
            r38 = 536870912(0x20000000, float:1.0842022E-19)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x0126
            r38 = 0
            goto L_0x0128
        L_0x0126:
            r38 = r102
        L_0x0128:
            r39 = 1073741824(0x40000000, float:2.0)
            r39 = r0 & r39
            if (r39 == 0) goto L_0x0131
            r39 = 0
            goto L_0x0133
        L_0x0131:
            r39 = r103
        L_0x0133:
            r40 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r40
            if (r0 == 0) goto L_0x013b
            r0 = 0
            goto L_0x013d
        L_0x013b:
            r0 = r104
        L_0x013d:
            r40 = r1 & 1
            if (r40 == 0) goto L_0x0144
            r40 = 0
            goto L_0x0146
        L_0x0144:
            r40 = r105
        L_0x0146:
            r41 = r1 & 2
            if (r41 == 0) goto L_0x014d
            r41 = 0
            goto L_0x014f
        L_0x014d:
            r41 = r106
        L_0x014f:
            r42 = r1 & 4
            if (r42 == 0) goto L_0x0156
            r42 = 0
            goto L_0x0158
        L_0x0156:
            r42 = r107
        L_0x0158:
            r43 = r1 & 8
            if (r43 == 0) goto L_0x015f
            r43 = 0
            goto L_0x0161
        L_0x015f:
            r43 = r108
        L_0x0161:
            r44 = r1 & 16
            if (r44 == 0) goto L_0x0168
            r44 = 0
            goto L_0x016a
        L_0x0168:
            r44 = r109
        L_0x016a:
            r45 = r1 & 32
            if (r45 == 0) goto L_0x0171
            r45 = 0
            goto L_0x0173
        L_0x0171:
            r45 = r110
        L_0x0173:
            r46 = r1 & 64
            if (r46 == 0) goto L_0x017a
            r46 = 0
            goto L_0x017c
        L_0x017a:
            r46 = r111
        L_0x017c:
            r147 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0184
            r0 = 0
            goto L_0x0186
        L_0x0184:
            r0 = r112
        L_0x0186:
            r47 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018e
            r0 = 0
            goto L_0x0190
        L_0x018e:
            r0 = r113
        L_0x0190:
            r48 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0198
            r0 = 0
            goto L_0x019a
        L_0x0198:
            r0 = r114
        L_0x019a:
            r49 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01a2
            r0 = 0
            goto L_0x01a4
        L_0x01a2:
            r0 = r115
        L_0x01a4:
            r50 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01ac
            r0 = 0
            goto L_0x01ae
        L_0x01ac:
            r0 = r116
        L_0x01ae:
            r51 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b6
            r0 = 0
            goto L_0x01b8
        L_0x01b6:
            r0 = r117
        L_0x01b8:
            r52 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01c0
            r0 = 0
            goto L_0x01c2
        L_0x01c0:
            r0 = r118
        L_0x01c2:
            r53 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01ca
            r0 = 0
            goto L_0x01cc
        L_0x01ca:
            r0 = r119
        L_0x01cc:
            r18 = r1 & r18
            if (r18 == 0) goto L_0x01d3
            r18 = 0
            goto L_0x01d5
        L_0x01d3:
            r18 = r120
        L_0x01d5:
            r20 = r1 & r20
            if (r20 == 0) goto L_0x01dc
            r20 = 0
            goto L_0x01de
        L_0x01dc:
            r20 = r121
        L_0x01de:
            r22 = r1 & r22
            if (r22 == 0) goto L_0x01e5
            r22 = 0
            goto L_0x01e7
        L_0x01e5:
            r22 = r122
        L_0x01e7:
            r24 = r1 & r24
            if (r24 == 0) goto L_0x01ee
            r24 = 0
            goto L_0x01f0
        L_0x01ee:
            r24 = r123
        L_0x01f0:
            r26 = r1 & r26
            if (r26 == 0) goto L_0x01f7
            r26 = 0
            goto L_0x01f9
        L_0x01f7:
            r26 = r124
        L_0x01f9:
            r28 = r1 & r28
            if (r28 == 0) goto L_0x0200
            r28 = 0
            goto L_0x0202
        L_0x0200:
            r28 = r125
        L_0x0202:
            r54 = 2097152(0x200000, float:2.938736E-39)
            r54 = r1 & r54
            if (r54 == 0) goto L_0x020b
            r54 = 0
            goto L_0x020d
        L_0x020b:
            r54 = r126
        L_0x020d:
            r55 = 4194304(0x400000, float:5.877472E-39)
            r55 = r1 & r55
            if (r55 == 0) goto L_0x0216
            r55 = 0
            goto L_0x0218
        L_0x0216:
            r55 = r127
        L_0x0218:
            r56 = 8388608(0x800000, float:1.17549435E-38)
            r56 = r1 & r56
            if (r56 == 0) goto L_0x0221
            r56 = 0
            goto L_0x0223
        L_0x0221:
            r56 = r128
        L_0x0223:
            r57 = 16777216(0x1000000, float:2.3509887E-38)
            r57 = r1 & r57
            if (r57 == 0) goto L_0x022c
            r57 = 0
            goto L_0x022e
        L_0x022c:
            r57 = r129
        L_0x022e:
            r58 = 33554432(0x2000000, float:9.403955E-38)
            r58 = r1 & r58
            if (r58 == 0) goto L_0x0237
            r58 = 0
            goto L_0x0239
        L_0x0237:
            r58 = r130
        L_0x0239:
            r59 = 67108864(0x4000000, float:1.5046328E-36)
            r59 = r1 & r59
            if (r59 == 0) goto L_0x0242
            r59 = 0
            goto L_0x0244
        L_0x0242:
            r59 = r131
        L_0x0244:
            r60 = 134217728(0x8000000, float:3.85186E-34)
            r60 = r1 & r60
            if (r60 == 0) goto L_0x024d
            r60 = 0
            goto L_0x024f
        L_0x024d:
            r60 = r132
        L_0x024f:
            r61 = 268435456(0x10000000, float:2.5243549E-29)
            r61 = r1 & r61
            if (r61 == 0) goto L_0x0258
            r61 = 0
            goto L_0x025a
        L_0x0258:
            r61 = r133
        L_0x025a:
            r62 = 536870912(0x20000000, float:1.0842022E-19)
            r62 = r1 & r62
            if (r62 == 0) goto L_0x0263
            r62 = 0
            goto L_0x0265
        L_0x0263:
            r62 = r134
        L_0x0265:
            r63 = 1073741824(0x40000000, float:2.0)
            r63 = r1 & r63
            if (r63 == 0) goto L_0x026e
            r63 = 0
            goto L_0x0270
        L_0x026e:
            r63 = r135
        L_0x0270:
            r64 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r64
            if (r1 == 0) goto L_0x0278
            r1 = 0
            goto L_0x027a
        L_0x0278:
            r1 = r136
        L_0x027a:
            r64 = r2 & 1
            if (r64 == 0) goto L_0x0281
            r64 = 0
            goto L_0x0283
        L_0x0281:
            r64 = r137
        L_0x0283:
            r65 = r2 & 2
            if (r65 == 0) goto L_0x028a
            r65 = 0
            goto L_0x028c
        L_0x028a:
            r65 = r138
        L_0x028c:
            r66 = r2 & 4
            if (r66 == 0) goto L_0x0293
            r66 = 0
            goto L_0x0295
        L_0x0293:
            r66 = r139
        L_0x0295:
            r67 = r2 & 8
            if (r67 == 0) goto L_0x029c
            r67 = 0
            goto L_0x029e
        L_0x029c:
            r67 = r140
        L_0x029e:
            r68 = r2 & 16
            if (r68 == 0) goto L_0x02a5
            r68 = 0
            goto L_0x02a7
        L_0x02a5:
            r68 = r141
        L_0x02a7:
            r69 = r2 & 32
            if (r69 == 0) goto L_0x02ae
            r69 = 0
            goto L_0x02b0
        L_0x02ae:
            r69 = r142
        L_0x02b0:
            r70 = r2 & 64
            if (r70 == 0) goto L_0x02b7
            r70 = 0
            goto L_0x02b9
        L_0x02b7:
            r70 = r143
        L_0x02b9:
            r148 = r1
            r1 = r2 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x02c1
            r1 = 0
            goto L_0x02c3
        L_0x02c1:
            r1 = r144
        L_0x02c3:
            r71 = r1
            r1 = r2 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02cb
            r1 = 0
            goto L_0x02cd
        L_0x02cb:
            r1 = r145
        L_0x02cd:
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x02d3
            r2 = 0
            goto L_0x02d5
        L_0x02d3:
            r2 = r146
        L_0x02d5:
            r73 = r72
            r74 = r3
            r75 = r5
            r76 = r6
            r77 = r7
            r78 = r8
            r79 = r9
            r80 = r10
            r81 = r11
            r82 = r12
            r83 = r13
            r84 = r14
            r85 = r15
            r86 = r16
            r87 = r17
            r88 = r4
            r89 = r19
            r90 = r21
            r91 = r23
            r92 = r25
            r93 = r27
            r94 = r29
            r95 = r30
            r96 = r31
            r97 = r32
            r98 = r33
            r99 = r34
            r100 = r35
            r101 = r36
            r102 = r37
            r103 = r38
            r104 = r39
            r105 = r147
            r106 = r40
            r107 = r41
            r108 = r42
            r109 = r43
            r110 = r44
            r111 = r45
            r112 = r46
            r113 = r47
            r114 = r48
            r115 = r49
            r116 = r50
            r117 = r51
            r118 = r52
            r119 = r53
            r120 = r0
            r121 = r18
            r122 = r20
            r123 = r22
            r124 = r24
            r125 = r26
            r126 = r28
            r127 = r54
            r128 = r55
            r129 = r56
            r130 = r57
            r131 = r58
            r132 = r59
            r133 = r60
            r134 = r61
            r135 = r62
            r136 = r63
            r137 = r148
            r138 = r64
            r139 = r65
            r140 = r66
            r141 = r67
            r142 = r68
            r143 = r69
            r144 = r70
            r145 = r71
            r146 = r1
            r147 = r2
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct.<init>(java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPictures, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductFlags, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeightsAndMeasures, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMarketingSalesUnit, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMinimumAge, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMinimumAge, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffNonFood, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTechnicalAttribute, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalAttribute, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.lang.Double, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct$BffRepairIndexTemplate, java.util.List, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
