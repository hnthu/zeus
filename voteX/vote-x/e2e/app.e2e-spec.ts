import { VoteXPage } from './app.po';

describe('vote-x App', () => {
  let page: VoteXPage;

  beforeEach(() => {
    page = new VoteXPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
