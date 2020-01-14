DROP TABLE IF EXISTS vj__sponsorships;

CREATE TABLE IF NOT EXISTS vj__sponsorships (
  id INTEGER CONSTRAINT pk_sponsorships PRIMARY KEY,
  company_id INTEGER REFERENCES vj__companies (id),
  verification_code VARCHAR(50) NOT NULL,
  has_verified BOOLEAN NOT NULL
);