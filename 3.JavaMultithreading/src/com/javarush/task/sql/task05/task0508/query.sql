-- Write your code here:
UPDATE author SET
full_name = CASE WHEN full_name = 'C. S. Lewis' THEN full_name = 'Clive Staples Lewis' ELSE full_name END,
full_name = CASE WHEN full_name = 'J. R. R. Tolkien' THEN full_name = 'John Ronald Reuel Tolkien' ELSE full_name END,
full_name = CASE WHEN full_name = 'Friedrich Nietzsche' THEN full_name = 'Friedrich Wilhelm Nietzsche' ELSE full_name END,
full_name = CASE WHEN full_name = 'Stephen King' THEN full_name = 'Stephen Edwin King' ELSE full_name END,
full_name = CASE WHEN full_name = 'Aldous Huxley' THEN full_name = 'Aldous Leonard Huxley' ELSE full_name END
WHERE full_name IN ('C. S. Lewis&', 'J. R. R. Tolkien', 'Friedrich Nietzsche', 'Stephen King', 'Aldous Huxley');