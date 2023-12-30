package spireMapOverhaul.zones.CosmicEukotranpha.cards.special;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import spireMapOverhaul.zones.CosmicEukotranpha.cards.BaseCard;
import spireMapOverhaul.zones.CosmicEukotranpha.cards.choice.Pages.PaisansChoice;
import spireMapOverhaul.zones.CosmicEukotranpha.cards.choice.Pages.PuisneChoice;
import spireMapOverhaul.zones.CosmicEukotranpha.cards.choice.Pages.PuissantChoice;
import spireMapOverhaul.zones.CosmicEukotranpha.cards.choice.Pages.PursuivantChoice;

import static com.megacrit.cardcrawl.cards.AbstractCard.CardColor.COLORLESS;
import static com.megacrit.cardcrawl.cards.AbstractCard.CardRarity.SPECIAL;
import static com.megacrit.cardcrawl.cards.AbstractCard.CardTarget.SELF;
import static com.megacrit.cardcrawl.cards.AbstractCard.CardType.SKILL;
import static spireMapOverhaul.zones.CosmicEukotranpha.util.CosmicShortcuts.choiceAP;
import static spireMapOverhaul.zones.CosmicEukotranpha.util.CosmicShortcuts.draw;import spireMapOverhaul.SpireAnniversary6Mod;
public class PageC extends BaseCard{public static String ID=SpireAnniversary6Mod.makeID(PageC.class.getSimpleName());
    public PageC(){super(ID,1,SKILL,SELF,SPECIAL,COLORLESS);upgradeBaseCost(0);}
    @Override public void use(AbstractPlayer p,AbstractMonster m){
        //Page C
        choiceAP(new AbstractCard[]{new PaisansChoice(),new PuisneChoice(),new PuissantChoice(),new PursuivantChoice()});draw(1);
    }
    @Override public void upgrade(){if(!upgraded){upgradeName();initializeDescription();this.initializeTitle();}}}



