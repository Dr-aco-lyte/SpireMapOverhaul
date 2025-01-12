package spireMapOverhaul.zones.invasion.powers;

import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.PowerStrings;
import spireMapOverhaul.SpireAnniversary6Mod;
import spireMapOverhaul.abstracts.AbstractSMOPower;
import spireMapOverhaul.zones.invasion.monsters.ElementalPortal;

public class SummoningPortalPower extends AbstractSMOPower {
    public static final String POWER_ID = SpireAnniversary6Mod.makeID("SummoningPortal");
    private static final PowerStrings powerStrings = CardCrawlGame.languagePack.getPowerStrings(POWER_ID);
    public static final String NAME = powerStrings.NAME;
    public static final String[] DESCRIPTIONS = powerStrings.DESCRIPTIONS;

    public SummoningPortalPower(AbstractCreature owner, int amount) {
        super(POWER_ID, NAME, PowerType.BUFF, false, owner, amount);
    }

    @Override
    public int onAttackedToChangeDamage(DamageInfo info, int damageAmount) {
        if (this.amount > 0) {
            damageAmount = 0;
        }

        return damageAmount;
    }

    @Override
    public void updateDescription() {
        this.description = DESCRIPTIONS[0].replace("{0}", ElementalPortal.MAX_ELEMENTALS_ON_FIELD + "").replace("{1}", this.amount + "");
    }
}