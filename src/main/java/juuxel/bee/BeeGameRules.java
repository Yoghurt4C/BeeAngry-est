package juuxel.bee;

import juuxel.bee.mixin.BooleanRuleAccessor;
import juuxel.bee.mixin.GameRulesAccessor;
import net.minecraft.world.GameRules;

public final class BeeGameRules {
    public static GameRules.RuleKey<GameRules.BooleanRule> SAVE_SCOOPED_BEE_NBT = register("saveScoopedBeeNbt", true);
    public static GameRules.RuleKey<GameRules.BooleanRule> ALWAYS_DROP_SCOOPED_BEES = register("alwaysDropScoopedBees", true);
    public static GameRules.RuleKey<GameRules.BooleanRule> BEES_SEEK_RAIN_SHELTER = register("beesSeekRainShelter", true);

    private BeeGameRules() {}

    public static void init() {

    }

    private static GameRules.RuleKey<GameRules.BooleanRule> register(String name, boolean defaultValue) {
        return GameRulesAccessor.callRegister(BeeAngryest.ID + ":" + name, BooleanRuleAccessor.callOf(defaultValue));
    }
}
