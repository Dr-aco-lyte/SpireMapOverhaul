package spireMapOverhaul.zones.invasion.cards;

import spireMapOverhaul.abstracts.AbstractSMOCard;
import spireMapOverhaul.zones.invasion.interfaces.CustomPriceCard;

public abstract class AbstractInvasionZoneRewardCard extends AbstractSMOCard implements CustomPriceCard {
    public AbstractInvasionZoneRewardCard(String cardID, int cost, CardType type, CardRarity rarity, CardTarget target) {
        super(cardID, cost, type, rarity, target);
    }

    public AbstractInvasionZoneRewardCard(String cardID, int cost, CardType type, CardRarity rarity, CardTarget target, CardColor color) {
        super(cardID, cost, type, rarity, target, color);
    }

    public AbstractInvasionZoneRewardCard(String cardID, int cost, CardType type, CardRarity rarity, CardTarget target, CardColor color, String textureString) {
        super(cardID, cost, type, rarity, target, color, textureString);
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
