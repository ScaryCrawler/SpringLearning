public class BraveKnigth implements Knigth{
    private Quest quest;

    public BraveKnigth(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
