package me.tofaa.entitylib.meta.mobs.monster.zombie;

import me.tofaa.entitylib.meta.Metadata;

public class DrownedMeta extends ZombieMeta {

    public static final byte OFFSET = ZombieMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;
    public DrownedMeta(int entityId, Metadata metadata) {
        super(entityId, metadata);
    }
}
