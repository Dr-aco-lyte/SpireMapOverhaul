package spireMapOverhaul.zones.CosmicEukotranpha.cardEffects.cardManip;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.localization.UIStrings;
import spireMapOverhaul.zones.CosmicEukotranpha.cardEffects.CosmicZoneAbstractGameAction;
public class CosmicZoneRotateEffect extends CosmicZoneAbstractGameAction{public boolean sc=true;private static final UIStrings uiStrings;public static final String[] TEXT;private AbstractPlayer p;private boolean isRandom;public static int numDiscarded;private boolean optional;private static int amount;
    public CosmicZoneRotateEffect(int amount, boolean isRandom){this(amount,isRandom,false);}public CosmicZoneRotateEffect(int amount){this(amount,false,false);}
    public CosmicZoneRotateEffect(int amount, boolean isRandom,boolean optional){this.p=AbstractDungeon.player;this.isRandom=isRandom;this.actionType=ActionType.DISCARD;this.duration=this.startDuration=Settings.ACTION_DUR_XFAST;this.amount=amount;this.optional=optional;}
    public CosmicZoneRotateEffect makeCopy(){
        return new CosmicZoneRotateEffect(amount,isRandom,optional);}
    public void update(){if(sc){sc=false;if(AbstractDungeon.getMonsters().areMonstersBasicallyDead()||amount<1){this.isDone=true;return;}
        if(isRandom){for(int i=0;i<amount;++i){AbstractCard c=this.p.hand.getRandomCard(AbstractDungeon.cardRandomRng);
            this.p.hand.moveToBottomOfDeck(c);}this.isDone=true;return;}
        if(optional){AbstractDungeon.handCardSelectScreen.open("TODO: Rotate Text",amount,true,true,false,false,true);
        }else{if(p.hand.size()>amount){AbstractDungeon.handCardSelectScreen.open("TODO: Rotate Text",amount,false,false,false,false,false);}else{for(AbstractCard c:p.hand.group){AbstractDungeon.handCardSelectScreen.selectedCards.addToBottom(c);}AbstractDungeon.handCardSelectScreen.wereCardsRetrieved=false;}}
    }else{if(!AbstractDungeon.handCardSelectScreen.wereCardsRetrieved){
        for(AbstractCard c:AbstractDungeon.handCardSelectScreen.selectedCards.group){p.hand.moveToBottomOfDeck(c);
        }AbstractDungeon.handCardSelectScreen.wereCardsRetrieved=true;}
        this.tickDuration();}}
    static{uiStrings=CardCrawlGame.languagePack.getUIString("DiscardAction");TEXT=uiStrings.TEXT;}}