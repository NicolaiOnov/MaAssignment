INSERT INTO Accounts (
	Number,
	Balance,
	Currency,
	LastOperation)
VALUES
(
	'GB33BUKB20201555555555',
	10000,
	'GBP',
	null
),

(
	'DK94BARC10201530093459',
	2000000,
	'DKK',
	CONVERT(datetime2, GETDATE())
),

(
	'MD21EX000000000001234567',
	0.003,
	'MDL',
	CONVERT(datetime,'Apr 07 12:18:52 2009')
);